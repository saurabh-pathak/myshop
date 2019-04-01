package com.sau.myshop.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class LogoModel {
    
	@Inject
	private String altText;
	
	@Inject
	private String imgPath;

	public String getAltText() {
		return altText;
	}

	public String getImgPath() {
		return imgPath;
	}
	
	
}
