package com.tutorials4u.helloworld;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author info@tutorials4u.net
 */

public class WeatherAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private String message;

    private String userName;
    private List<Weather> weatherList = new ArrayList<Weather>();
    private String chosenWeather;
    
   

	public String getChosenWeather() {
		return chosenWeather;
	}

	public void setChosenWeather(String chosenWeather) {
		this.chosenWeather = chosenWeather;
	}

	public WeatherAction() {
    }

    public String execute() {
        setMessage("Hello " + getUserName());
       
        return "SUCCESS";
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public List<Weather> getWeatherList() {
		return weatherList;
	}

	public void setWeatherList(List<Weather> weatherList) {
		this.weatherList = weatherList;
	}
}