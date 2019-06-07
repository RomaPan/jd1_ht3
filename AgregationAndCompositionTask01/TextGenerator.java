package by.htp.les09.AgregationAndCompositionTask01;

public class TextGenerator {

	public static void main(String[] args) {
		Word word1 = new Word ("Doctor");
		Word word2 = new Word ("Who");
		
		Sentence sentence1 = new Sentence();
		sentence1.addWordToSentence(word1);
		sentence1.addWordToSentence(word2);	
		
		Sentence sentence2 = new Sentence();
		sentence2.addFullSentence("Doctor Who is a British science fiction television programme "
				+ "produced by the BBC.\nAs of 1 January 2019, 851 episodes of Doctor Who "
				+ "have aired, concluding the eleventh series.\nThis includes one television "
				+ "movie and multiple specials, and encompasses 287 stories over 37 seasons.");
		
		
		Text text1 = new Text(sentence1, sentence2);
		System.out.println(text1);
		
		Sentence sentence3 = new Sentence("\n\tAdditionally, four charity specials and two animated "
											+ "serials have also been aired.");
		
		text1.addText(sentence3);
		System.out.println(text1);
		
		System.out.println(text1.getTitle());
		System.out.println(text1.getText());

	}

}
