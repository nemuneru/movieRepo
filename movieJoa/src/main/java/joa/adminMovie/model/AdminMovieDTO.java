package joa.adminMovie.model;

import org.springframework.web.multipart.MultipartFile;

public class AdminMovieDTO {
	
	private int mov_idx;
	private String mov_title;
	private String mov_director;
	private String mov_cast;
	private String mov_start_date;
	private String mov_end_date;
	private String mov_country;
	private String mov_genre;
	private int mov_running_time;
	private String mov_rate;
	private String mov_info;
	private String mov_poster;
	private int mov_booking_percent;
	private int mov_gender_percent;
	private int mov_age_percent;
	private int mov_score;
	
	public AdminMovieDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminMovieDTO(int mov_idx, String mov_title, String mov_director, String mov_cast, String mov_start_date,
			String mov_end_date, String mov_country, String mov_genre, int mov_running_time, String mov_rate,
			String mov_info, String mov_poster, int mov_booking_percent, int mov_gender_percent, int mov_age_percent,
			int mov_score) {
		super();
		this.mov_idx = mov_idx;
		this.mov_title = mov_title;
		this.mov_director = mov_director;
		this.mov_cast = mov_cast;
		this.mov_start_date = mov_start_date;
		this.mov_end_date = mov_end_date;
		this.mov_country = mov_country;
		this.mov_genre = mov_genre;
		this.mov_running_time = mov_running_time;
		this.mov_rate = mov_rate;
		this.mov_info = mov_info;
		this.mov_poster = mov_poster;
		this.mov_booking_percent = mov_booking_percent;
		this.mov_gender_percent = mov_gender_percent;
		this.mov_age_percent = mov_age_percent;
		this.mov_score = mov_score;
	}

	public int getMov_idx() {
		return mov_idx;
	}

	public void setMov_idx(int mov_idx) {
		this.mov_idx = mov_idx;
	}

	public String getMov_title() {
		return mov_title;
	}

	public void setMov_title(String mov_title) {
		this.mov_title = mov_title;
	}

	public String getMov_director() {
		return mov_director;
	}

	public void setMov_director(String mov_director) {
		this.mov_director = mov_director;
	}

	public String getMov_cast() {
		return mov_cast;
	}

	public void setMov_cast(String mov_cast) {
		this.mov_cast = mov_cast;
	}

	public String getMov_start_date() {
		return mov_start_date;
	}

	public void setMov_start_date(String mov_start_date) {
		this.mov_start_date = mov_start_date;
	}

	public String getMov_end_date() {
		return mov_end_date;
	}

	public void setMov_end_date(String mov_end_date) {
		this.mov_end_date = mov_end_date;
	}

	public String getMov_country() {
		return mov_country;
	}

	public void setMov_country(String mov_country) {
		this.mov_country = mov_country;
	}

	public String getMov_genre() {
		return mov_genre;
	}

	public void setMov_genre(String mov_genre) {
		this.mov_genre = mov_genre;
	}

	public int getMov_running_time() {
		return mov_running_time;
	}

	public void setMov_running_time(int mov_running_time) {
		this.mov_running_time = mov_running_time;
	}

	public String getMov_rate() {
		return mov_rate;
	}

	public void setMov_rate(String mov_rate) {
		this.mov_rate = mov_rate;
	}

	public String getMov_info() {
		return mov_info;
	}

	public void setMov_info(String mov_info) {
		this.mov_info = mov_info;
	}

	public String getMov_poster() {
		return mov_poster;
	}

	public void setMov_poster(String mov_poster) {
		this.mov_poster = mov_poster;
	}

	public int getMov_booking_percent() {
		return mov_booking_percent;
	}

	public void setMov_booking_percent(int mov_booking_percent) {
		this.mov_booking_percent = mov_booking_percent;
	}

	public int getMov_gender_percent() {
		return mov_gender_percent;
	}

	public void setMov_gender_percent(int mov_gender_percent) {
		this.mov_gender_percent = mov_gender_percent;
	}

	public int getMov_age_percent() {
		return mov_age_percent;
	}

	public void setMov_age_percent(int mov_age_percent) {
		this.mov_age_percent = mov_age_percent;
	}

	public int getMov_score() {
		return mov_score;
	}

	public void setMov_score(int mov_score) {
		this.mov_score = mov_score;
	}

	


}
