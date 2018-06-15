package de.avg._abgabe.kreditsystem;

public class Kreditor {
	private String vorname;
	private String nachname;
	private Long kreditsumme;
	private Long alter;
	private String business;
	private Long laufzeit;
	private Integer score;
	
	public Kreditor(String vorname, String nachname, Long kreditsumme, Long alter, String business, Long laufzeit,
			Integer score) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.kreditsumme = kreditsumme;
		this.alter = alter;
		this.business = business;
		this.laufzeit = laufzeit;
		this.score = score;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Long getKreditsumme() {
		return kreditsumme;
	}

	public void setKreditsumme(Long kreditsumme) {
		this.kreditsumme = kreditsumme;
	}

	public Long getAlter() {
		return alter;
	}

	public void setAlter(Long alter) {
		this.alter = alter;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public Long getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(Long laufzeit) {
		this.laufzeit = laufzeit;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("\n Score: %1$d \n Vorname: %2$s \n Nachname: %3$s \n Alter: %4$d \n Kreditsumme: %5$d \n Laufzeit: %6$d \n Business: %7$s", score, vorname, nachname, alter, kreditsumme, laufzeit, business);
	}
	
	
	
	
	
}
