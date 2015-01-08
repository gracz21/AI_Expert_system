package com.sample;

public class Questions {
	
	public static class Question {
		public String text;
		public String[] answers;
		
		public Question(String t, String... a) {
			text = t;
			answers = a;
		}
	}
	
	public static class Init {
		public Question[] questions;
		
		public Init() {
			questions = new Question[20];
			
			questions[0] = new Question("Jako dziecko zawsze chciałem być ...", 
					"bramkarzem.", "obrońcą.", "pomocnikiem.", "napastnikiem.");
			
			questions[1] = new Question("Czy lubisz dalekie wypady?", "Nie", "Tak");
			
			questions[2] = new Question("Które zdanie najlepiej określa poziom Twojego szczęścia w życiu?",
					"Gola potrafi mi strzelić nawet bramkarz przeciwnika ze swojego pola karnego.",
					"Z większości sytuacji podbramkowych wychodzę zwycięsko.",
					"Szczęście mam wpisane w nazwisko.");
			
			questions[3] = new Question("W jakim jesteś wieku?", "22 lata lub mniej",
					"Między 23, a 28 rokiem życia", "Powyżej 28 lat");
			
			questions[4] = new Question("Jakiego jesteś wzrostu?", "169 cm lub mniej",
					"Między 170 cm, a 174 cm", "Powyżej 174 cm");
			
			questions[5] = new Question("Czy jesteś agresywny?", "Nie, jestem raczej spokojny.",
					"Czasami bywam agresywny.", "Czekaj, muszę kogoś zabić. Zaraz wracam ...");
			
			questions[6] = new Question("Jaki jest Twój schemat działania?", "Nie działam i nie myślę.",
					"Najpierw działam, a potem myślę nad konsekwencjami.",
					"Najpierw myślę, a potem działam według opracowanego planu.");
			
			questions[7] = new Question("Czy masz zdolności przywódcze?", "Nie", "Tak");
			
			questions[8] = new Question("Czy lubisz banany?", "Nie", "Tak");
			
			questions[9] = new Question("Które zdanie najlepiej podsumowuje Twoje podejście do życia?",
					"Preferuję powolne rozegranie.", "Lubię frontalny atak.");
			
			questions[10] = new Question("Czy lubisz prace ogrodowe?", "Nie", "Tak");
			
			questions[11] = new Question("Czy masz brodę?", "Nie", "Tak");
			
			questions[12] = new Question("Czy łatwo Ci zaimponować?", "Nie", "Tak");
			
			questions[13] = new Question("Czy jesteś samolubny?", "Nie, często lubię asystować i pomagać innym ludziom.",
					"Nie należę do najbardziej samolubnych, ale czasami lubię zabrać się samemu z piłką.",
					"Programie, dlaczego używasz zasobów MOJEGO komputera?");
			
			questions[14] = new Question("Czy lubisz chipsy Lay'sy?", "Nie", "Tak");
			
			questions[15] = new Question("Czy lubisz wybuchowe imprezy?", "Nie", "Tak");
			
			questions[16] = new Question("Czy jesteś zarozumiały?", "Nie.", "Może trochę.", 
					"Mógłbyś nie zwracać się do mnie per Ty?");
			questions[17] = new Question("Czy lubisz nurkować?", "Nie", "Tak");
			
			questions[18] = new Question("Butelka żelu do włosów starcza Ci na...",
					"Nie uzywam żelu/starcza mi na ponad miesiąc.", "miesiąc lub kilka tygodni.",
					"tydzień lub mniej.");
			
			questions[19] = new Question("Czy lubisz coś przegryźć od czasu do czasu?", 
					"Nie, preferuję posiłki w regularnych odstępach czasu.", "Tak, a jakże.");
		}
	}
}