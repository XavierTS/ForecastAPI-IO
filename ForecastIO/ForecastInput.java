package com.ForecastIO;

import java.util.List;

public class ForecastInput {

	public float latitude;

	public float longitude;

	public String timezone;

	public int offset;

	public Currently currently;

	public Minutely minutely;

	public Hourly hourly;

	public Daily daily;

	public List<Alert> alerts;

	public Flags flags;

	@Override
	public String toString() {
		return "ForecastInput [latitude=" + latitude + ", longitude="
				+ longitude + ", timezone=" + timezone + ", offset=" + offset
				+ ", currently=" + currently + ", minutely=" + minutely
				+ ", hourly=" + hourly + ", daily=" + daily + ", alerts="
				+ alerts + ", flags=" + flags + "]";
	}

	public class Currently {

		public long time;

		public String summary;

		public String icon;

		public float preciplongensity;

		public float precipProbability;

		public float temperature;

		public float dewPolong;

		public float windSpeed;

		public float windBearing;

		public float cloudCover;

		public float humidity;

		public float pressure;

		public float visibility;

		public float ozone;

		@Override
		public String toString() {
			return "Currently [time=" + time + ", summary=" + summary
					+ ", icon=" + icon + ", preciplongensity="
					+ preciplongensity + ", precipProbability="
					+ precipProbability + ", temperature=" + temperature
					+ ", dewPolong=" + dewPolong + ", windSpeed=" + windSpeed
					+ ", windBearing=" + windBearing + ", cloudCover="
					+ cloudCover + ", humidity=" + humidity + ", pressure="
					+ pressure + ", visibility=" + visibility + ", ozone="
					+ ozone + "]";
		}
	}

	public class MinuteForecast {

		public long time;

		public float preciplongensity;

		@Override
		public String toString() {
			return "MinuteForecast [time=" + time + ", preciplongensity="
					+ preciplongensity + "]";
		}
	}

	public class Minutely {

		public String summary;

		public String icon;

		public List<MinuteForecast> data;

		@Override
		public String toString() {
			return "Minutely [summary=" + summary + ", icon=" + icon
					+ ", data=" + data + "]";
		}
	}

	public class HourForecast {

		public long time;

		public String summary;

		public String icon;

		public float preciplongensity;

		public float temperature;

		public float dewPolong;

		public float windSpeed;

		public float windBearing;

		public float cloudCover;

		public float humidity;

		public float pressure;

		public float visibility;

		public float ozone;

		@Override
		public String toString() {
			return "HourForecast [time=" + time + ", summary=" + summary
					+ ", icon=" + icon + ", preciplongensity="
					+ preciplongensity + ", temperature=" + temperature
					+ ", dewPolong=" + dewPolong + ", windSpeed=" + windSpeed
					+ ", windBearing=" + windBearing + ", cloudCover="
					+ cloudCover + ", humidity=" + humidity + ", pressure="
					+ pressure + ", visibility=" + visibility + ", ozone="
					+ ozone + "]";
		}
	}

	public class Hourly {

		public String summary;

		public String icon;

		public List<HourForecast> data;

		@Override
		public String toString() {
			return "Hourly [summary=" + summary + ", icon=" + icon + ", data="
					+ data + "]";
		}
	}

	public class DailyForecast {

		public long time;

		public String summary;

		public String icon;

		public long sunriseTime;

		public long sunsetTime;

		public float preciplongensity;

		public float preciplongensityMax;

		public float precipProbability;

		public float temperatureMin;

		public long temperatureMlongime;

		public float temperatureMax;

		public long temperatureMaxTime;

		public float dewPolong;

		public float windSpeed;

		public float windBearing;

		public float cloudCover;

		public float humidity;

		public float pressure;

		public float visibility;

		public float ozone;

		@Override
		public String toString() {
			return "DailyForecast [time=" + time + ", summary=" + summary
					+ ", icon=" + icon + ", sunriseTime=" + sunriseTime
					+ ", sunsetTime=" + sunsetTime + ", preciplongensity="
					+ preciplongensity + ", preciplongensityMax="
					+ preciplongensityMax + ", precipProbability="
					+ precipProbability + ", temperatureMin=" + temperatureMin
					+ ", temperatureMlongime=" + temperatureMlongime
					+ ", temperatureMax=" + temperatureMax
					+ ", temperatureMaxTime=" + temperatureMaxTime
					+ ", dewPolong=" + dewPolong + ", windSpeed=" + windSpeed
					+ ", windBearing=" + windBearing + ", cloudCover="
					+ cloudCover + ", humidity=" + humidity + ", pressure="
					+ pressure + ", visibility=" + visibility + ", ozone="
					+ ozone + "]";
		}
	}

	public class Daily {

		public String summary;

		public String icon;

		public List<DailyForecast> data;

		@Override
		public String toString() {
			return "Daily [summary=" + summary + ", icon=" + icon + ", data="
					+ data + "]";
		}
	}

	public class Alert {

		public String title;
		// TODO No idea if its a long or int. not found in my current json
		// request. Prob a long.
		public long expires;

		public String uri;

		@Override
		public String toString() {
			return "Alert [title=" + title + ", expires=" + expires + ", uri="
					+ uri + "]";
		}
	}

	public class Flags {

		public List<String> sources;

		public List<String> isd_stations;

		public List<String> lamp_stations;

		public List<String> metar_stations;

		public List<String> darksky_stations;

		public String units;

		@Override
		public String toString() {
			return "Flags [sources=" + sources + ", isd_stations="
					+ isd_stations + ", lamp_stations=" + lamp_stations
					+ ", metar_stations=" + metar_stations
					+ ", darksky_stations=" + darksky_stations + ", units="
					+ units + "]";
		}
	}

}
