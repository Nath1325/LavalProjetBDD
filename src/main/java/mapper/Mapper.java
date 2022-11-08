/**
 * 
 */
package mapper;

import com.laval.project.dto.BikerouteDto;
import com.laval.project.dto.RestaurantDto;
import com.laval.projet.models.Bikeroute;
import com.laval.projet.models.Restaurant;

/**
 * @author Faustin
 *
 */
public class Mapper {
	
	 public RestaurantDto convertToRestaurantDto(Restaurant restaurent) {
		 RestaurantDto restaurantDto = new RestaurantDto();
		 restaurantDto.setId(restaurent.getId());
		 restaurantDto.setNom(restaurent.getNom());
		 restaurantDto.setSiteWeb(restaurent.getSiteWeb()); 
		  		 
	     return restaurantDto;
	
	 }
	 public Restaurant convertToRestaurant(RestaurantDto restaurantDto) {
		 Restaurant restaurant = new Restaurant();
		 
		 restaurant.setNom(restaurantDto.getNom());
		 restaurant.setSiteWeb(restaurantDto.getSiteWeb());
		 restaurant.setNumeroCivique(restaurantDto.getNumeroCivique());
		 
		 restaurant.setNumeroCivique(restaurantDto.getNumeroCivique());
		 restaurant.setCodePostal(restaurantDto.getCodePostal());
		 restaurant.setVille(restaurantDto.getVille());
		 restaurant.setRue(restaurantDto.getRue());
		  
	     return restaurant;
	
	 }
	 public BikerouteDto convertToBikeRouteFDto(Bikeroute bikeroute) {
		 BikerouteDto bikeRouteDto=new BikerouteDto();
		 
		 bikeRouteDto.setGeometry(bikeroute.geometry);
		 bikeRouteDto.setProperties(bikeroute.getProperties());
		 bikeRouteDto.setType(bikeroute.getType());
		 
		 
		return bikeRouteDto;		 
		 
	 }
	 public Bikeroute convertToBikeRoute(BikerouteDto bikeRouteDto) {
		 
		 Bikeroute bikeRoute =new Bikeroute();
		 
		 bikeRoute.setGeometry(bikeRouteDto.getGeometry());
		 bikeRoute.setProperties(bikeRouteDto.getProperties());
		 bikeRoute.setType(bikeRouteDto.getType());
		 
		return bikeRoute;		 
		 
	 } 
	

}