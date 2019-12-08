/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 08-Dec-2019
 *  FILE NAME  		: 	 HandlingAuthenticateAPI.java
 *  PROJECT NAME 	:	 ExploringAutomation
 * 	Class Time		:    11:59:00 am
 */
package com.exploreRestAssured.Features;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HandlingAuthenticateAPI 
{
	{
		//Storing the jSon response in the response reference variable 
		 Response res= 		 
		 
		 given()
		 //Expected / Fetch the data in jSon format
		 .contentType(ContentType.JSON)
		 .auth()  									 
		 .basic("userName","Password")				//Pass the authorization
		 .param("paramsKey1", "paramValue1")		//Passing the params key and value 
		 .param("paramsKey N", "paramValue N")		
		 .header("HeaderKey1", "Header Value 1")	//Passing the header value 
		 .header("HeaderKey N", "Header Value N")
		 .when().get("API URI");		// Get the data from the desire URL 
		 
		 
		 System.out.println("Status Code is \t:\t"+res.statusCode());// Print the status code 
		 System.out.println("Response is "+res.asString());// print the data in jSon Formate
		
	}


}
