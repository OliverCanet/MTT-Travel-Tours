package com.mtt.travel;

import com.mtt.travel.models.Tour;
import com.mtt.travel.repositories.TourRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelApplication.class, args);
	}


	@Bean
	public CommandLineRunner initData(TourRepository tourRepository)
	{
		return args ->{


			Tour tour1 = new Tour("Israel Adventure: Tel Aviv, the Dead Sea & Jerusalem",12333,"10 days |  14 days with Jordan extension","Come for the history, and stay for the culture.","Israel","Asia",true,"https://i.ibb.co/fvST86P/israel2.webp","https://i.ibb.co/Hq4K2B7/israel1.jpg","https://i.ibb.co/kD7R5DJ/israel3.jpg","https://i.ibb.co/R9K8Np3/israel4.jpg","asd","Ancient and historic. Energetic and eclectic. For a nation steeped in thousands of years of tradition, Israel feels surprisingly contemporary. ","Step back in time at famous sites that span stunning landscapes on this small group Adventure Tour. Plus, after trying off-the-charts good food, you’ll discover why this small corner of the world makes such a big impression.");
			Tour tour2 = new Tour("A Week in Greece: Athens, Mykonos & Santorini",5700,"9 days |  12 days with Rome extension","Watch the setting sun from the hilltops of Greece’s most famous islands.","Greece","Europe",true,"https://i.ibb.co/cYF0Bcp/greece1.jpg","https://i.ibb.co/JBVZ9jn/greece2.jpg","https://i.ibb.co/3k1mXRs/greece3.jpg","https://i.ibb.co/xXFDvZZ/greece4.jpg","asd","Cobblestone streets, arched, whitewashed facades, cobalt-colored roofs, and rustic windmills are just a few of the picturesque Greek landscapes you can expect to find on this tour. Walk through ancient history and open-air museums in the capital, Athens.","Then, revel in the serenity and diversity of the Greek Islands on the isles of Mykonos and Santorini—daydreams come to life in a hundred shades of blue.");
			Tour tour3 = new Tour("Egypt & Nile River",2000,"12 days |  16 days with Jordan extension","Pharaohs and pyramids, sultans and souks, temples and tombs.","Egypt","Africa",true,"https://i.ibb.co/V2FGtSc/egypt1.jpg","https://i.ibb.co/6yXBKNx/egypt2.jpg","https://i.ibb.co/8s2ZXhk/egypt3.jpg","https://i.ibb.co/DDjmvZn/egypt4.jpg","asd","Descend into a world of ancient wonders to discover the lands behind the legends. Walk past towering stone icons, through avenues of sphinxes, and into royal valleys amid the desert sands. ","Then, cruise down the Nile and anchor at remote islands and beside the Theban Hills. End your adventure in Cairo, where historic mosques mingle with today’s modern bustle.");
			Tour tour4 = new Tour("Grand Tour of Italy",3400,"15 days |  17 days with Rome extension","Immerse yourself in Italy’s history and beauty on a grand journey from Milan to Rome.","Italy","Europe",true,"https://i.ibb.co/YQGB7nr/italy1.webp","https://i.ibb.co/ss68Wxg/italy2.jpg","https://i.ibb.co/ZMDVrNW/italy3.jpg","https://i.ibb.co/7zydZ6W/italy4.jpg","asd","From wandering through medieval piazzas, to basking in postcard-worthy views of Naples and sampling antipasti in Umbria, a tour of Italy is a feast for the eyes—and your taste buds. ","Our enchanting two-week tour will guide you through the iconic cities you’ve been dreaming of, including Florence, Rome, and Venice, as well as the smaller treasures of Lake Como, Assisi, and Sorrento. ");


			tourRepository.save(tour1);
			tourRepository.save(tour2);
			tourRepository.save(tour3);
			tourRepository.save(tour4);
		};

	}
}
