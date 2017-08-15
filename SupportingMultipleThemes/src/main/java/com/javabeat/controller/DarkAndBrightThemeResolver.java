package com.javabeat.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.theme.AbstractThemeResolver;

public class DarkAndBrightThemeResolver extends AbstractThemeResolver {
	public String resolveThemeName(HttpServletRequest arg0) {
		return isNight() ? "dark" : "bright";
	}

	// implementation
	private boolean isNight() {
		return new Random().nextBoolean();
	}

	public void setThemeName(HttpServletRequest arg0, HttpServletResponse arg1,String arg2) {
	}
}
