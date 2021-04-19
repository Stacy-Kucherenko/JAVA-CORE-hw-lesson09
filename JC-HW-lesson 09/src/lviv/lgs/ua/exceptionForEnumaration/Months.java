package lviv.lgs.ua.exceptionForEnumaration;



public enum Months  {
	DECEMBER(Seasons.WINTER, 31), JANUARY(Seasons.WINTER, 30), FEBRUARY(Seasons.WINTER, 28),
	MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30), MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30),
	JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31), SEPTEMBER(Seasons.FALL, 30), OCTOBER(Seasons.FALL, 31),
	NOVEMBER(Seasons.FALL, 30);

	Seasons seasons;
	int days;

	private Months(Seasons seasons, int days) {
		this.seasons = seasons;
		this.days = days;
	}

	public Seasons getSeasons() {
		return seasons;
	}

	public int getDays() {
		return days;
	}
}
