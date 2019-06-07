package by.htp.les09.AgregationAndCompositionTask01;

public class Text {

	private String title;
	private String text;
	
	public Text() {
		
	}
	
	
	public Text (Word title, Sentence body) {
		this.title = title.getWord();
		this.text = this.text + "\t " + body;
		
	}
	
	public Text (Sentence title, Sentence body) {
		this.title = title.getSentence();
		this.text = body.getSentence();
	}
	
	public void addText(Sentence text) {
		this.text = this.text + " " + text;
	}
	
	public void changeText(String newText) {
		this.text = newText;
	}
	
	public void changeTitle(String newTitle) {
		this.title = newTitle;
	}

	public String getTitle() {
		return title;
	}


	public String getText() {
		return text;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\t\t\t"+title + " \n\t" + text;
	}
	
	
}
