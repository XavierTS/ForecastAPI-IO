ForecastAPI-IO
==============

Java wrapper for "V2 Forecast API"(Forecast.io) with google GSON

####GZip

Every request are in GZip compression.

####Units

Units used by default are automatic with your current location.
ForecastOutput object has a method called setUnits(Units unit) where it receive a unit from the Units enumeration in file Units.java.

####Custom exclude

ForecastOutput object has a get method called getCustomExclude(Exclude[] exclude). The entire exclude enumeration can be found in the file Exclude.java.
