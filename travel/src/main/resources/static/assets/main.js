
const { createApp, ref } = Vue

let app = createApp({
    data() {
        return {
            url: "http://localhost:8080/api/tours",
            tours: [],
            toursDetail:[],
            filteredTours: [],
            search: '',
            selectedContinent: '',
            selectedCountry: '',
            selectedSort: '',


        }
    },
    created() {
        this.cargarData(this.url)
        

    },
    methods: {
        cargarData(url) {
            fetch(url)
                .then(response => response.json())
                .then(data => {
                    this.tours = data;
                    this.filteredTours = data;
                    this.details();
                    
                   
                    
                })
                .catch(error => console.error(error));
        },
        details() {
            const queryString = window.location.search;
            const parametros = new URLSearchParams(queryString);
            const id = parametros.get("id");
            this.toursDetail = this.tours.find(item => item.id == id);
            
        },
        clearFilters() {
            this.selectedContinent = '';
            this.selectedCountry = '';
            this.selectedSort = '';
            
        }
    },
    computed: {

        filtros() {
            let filteredTours = this.filteredTours;
            // Filter by search input
            filteredTours = filteredTours.filter(tour => tour.name.toLowerCase().includes(this.search.toLowerCase()));
            // Filter by selected continent
            if (this.selectedContinent) {
                filteredTours = filteredTours.filter(tour => tour.continent.toLowerCase() === this.selectedContinent.toLowerCase());
            }
            // Filter by selected country
            if (this.selectedCountry) {
                filteredTours = filteredTours.filter(tour => tour.country.toLowerCase() === this.selectedCountry.toLowerCase());
            }
            // Sort by selected option
            if (this.selectedSort === 'lowToHigh') {
                filteredTours.sort((a, b) => a.price - b.price);
            } else if (this.selectedSort === 'highToLow') {
                filteredTours.sort((a, b) => b.price - a.price);
            }
            return filteredTours;
        }

    }
})

app.mount('#app')