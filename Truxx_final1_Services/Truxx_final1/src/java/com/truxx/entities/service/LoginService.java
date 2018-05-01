/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truxx.entities.service;

import com.truxx.dao.LogindetailsDao;
import com.truxx.dao.TruckDetailDao;
import com.truxx.entities.LoginDetails;
import com.truxx.dao.UserDetailsDao;
import com.truxx.entities.StatusMessage;
import com.truxx.entities.Trips;
import com.truxx.entities.Trucks;
import com.truxx.entities.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




/**
 *
 * @author mspav
 */

@Stateless
@Path("/truxx")
public class LoginService {
    
        LogindetailsDao LogService = new LogindetailsDao();
	UserDetailsDao user=new UserDetailsDao();
	      TruckDetailDao trucks=new TruckDetailDao();
        
        @Path("/getlogindetails/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<LoginDetails> getloginDetails() {
		
            return LogService.getloginDetails();
            }
        
       
        @Path("/addLogin")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
	public String addLoginDetails(LoginDetails userdetails) {
		return LogService.addLoginDetails(userdetails);
	}
        @Path("/addTrip")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
	public StatusMessage addTrip(Trips tripdetails) {
		return user.BookTripdetails(tripdetails);
	} 
      
       @Path("/updateUser/")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
	public StatusMessage updateUserDetails(Users rev) {
		return user.updateUserDetails(rev);
	}
        @Path("/deletelogin/{userId}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
	public void deleteuserlogin(@PathParam("userId") int userid) {
		LogService.deleteLoginDetails(userid);
	}
        
        @Path("/deleteUser/{userId}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
	public void deleteuser(@PathParam("userId") int userid) {
		LogService.deleteUserDetails(userid);
	}
        @Path("/getuserid/{email}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
       	public Users getuserid(@PathParam("email") String email) {
		return user.getuserid(email);
	}
           @Path("/gettruckid/{capacity}/{starttime}/{endtime}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
       	public Trucks getuserid(@PathParam("capacity") String Capacity,@PathParam("starttime") String startdate,@PathParam("endtime") String endDate) {
		return user.gettruckid(Capacity,startdate,endDate);
	}
         @Path("/gettrucks/{userid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
      	public List<Trucks> getuserid(@PathParam("userid") int userid) {
		return trucks.getTruckDetails(userid);
	}
}

