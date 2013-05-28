package com.ForecastIO;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

import com.ForecastIO.ForecastInput;
import com.Utils.*;
import com.google.gson.Gson;

public class ForecastOuput {

	private String apiKey;
	private double lattitude;
	private double longitude;
	private long time;
	private String url;
	private Units unit = Units.auto;

	// Time in Unix Timestamp
	public ForecastOuput(String apiKey, double lattitude, double longitude,
			long time) {
		super();
		this.apiKey = apiKey;
		this.lattitude = lattitude;
		this.longitude = longitude;
		this.time = time;

		url = "https://api.forecast.io/forecast/" + apiKey + "/" + lattitude
				+ "," + longitude + "," + time + "?units=" + unit;

	}

	public ForecastOuput(String apiKey, double lattitude, double longitude) {
		super();
		this.apiKey = apiKey;
		this.lattitude = lattitude;
		this.longitude = longitude;

		url = "https://api.forecast.io/forecast/" + apiKey + "/" + lattitude
				+ "," + longitude + "?units=" + unit;
	}

	public ForecastInput get() throws IOException {

		URL url;

		url = new URL(this.url);

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("Accept-Encoding", "gzip,deflate");
		connection.setRequestMethod("GET");

		GZIPInputStream json = new GZIPInputStream(connection.getInputStream());

		Reader reader = new InputStreamReader(json);

		ForecastInput data = new Gson().fromJson(reader, ForecastInput.class);

		return data;

	}

	public ForecastInput getCurrently() throws IOException {

		URL url = new URL(this.url
				+ "&exclude=minutely,hourly,daily,alerts,flags");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("Accept-Encoding", "gzip,deflate");
		connection.setRequestMethod("GET");

		GZIPInputStream json = new GZIPInputStream(connection.getInputStream());

		Reader reader = new InputStreamReader(json);

		ForecastInput data = new Gson().fromJson(reader, ForecastInput.class);

		return data;

	}

	public ForecastInput getMinutely() throws IOException {

		URL url = new URL(this.url
				+ "&exclude=currently,hourly,daily,alerts,flags");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("Accept-Encoding", "gzip,deflate");
		connection.setRequestMethod("GET");

		GZIPInputStream json = new GZIPInputStream(connection.getInputStream());

		Reader reader = new InputStreamReader(json);

		ForecastInput data = new Gson().fromJson(reader, ForecastInput.class);

		return data;

	}

	public ForecastInput getHourly() throws IOException {

		URL url = new URL(this.url
				+ "&exclude=minutely,currently,daily,alerts,flags");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("Accept-Encoding", "gzip,deflate");
		connection.setRequestMethod("GET");

		GZIPInputStream json = new GZIPInputStream(connection.getInputStream());

		Reader reader = new InputStreamReader(json);

		ForecastInput data = new Gson().fromJson(reader, ForecastInput.class);

		return data;

	}

	public ForecastInput getDaily() throws IOException {

		URL url = new URL(this.url
				+ "&exclude=minutely,currently,hourly,alerts,flags");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("Accept-Encoding", "gzip,deflate");
		connection.setRequestMethod("GET");

		GZIPInputStream json = new GZIPInputStream(connection.getInputStream());

		Reader reader = new InputStreamReader(json);

		ForecastInput data = new Gson().fromJson(reader, ForecastInput.class);

		return data;

	}

	public ForecastInput getCustomExclude(Exclude[] exclude) throws IOException {

		URL url = new URL(this.url + RequestHelper.formatExcludeString(exclude));
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("Accept-Encoding", "gzip,deflate");
		connection.setRequestMethod("GET");

		GZIPInputStream json = new GZIPInputStream(connection.getInputStream());

		Reader reader = new InputStreamReader(json);

		ForecastInput data = new Gson().fromJson(reader, ForecastInput.class);

		return data;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(float lattitude) {
		this.lattitude = lattitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Units getUnit() {
		return unit;
	}

	public void setUnit(Units unit) {
		this.unit = unit;
	}

}
