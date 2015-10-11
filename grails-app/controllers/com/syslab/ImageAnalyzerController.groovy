package com.syslab

import grails.converters.JSON

class ImageAnalyzerController {

    def index() {
    	String image = params.image
    	Map response = [message: "Hola, manola!", image: image]
    	render response as JSON
    }
}
