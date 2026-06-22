package EndPoints;

public interface ApiEndpoints {
	
	public String shopperlogin="/users/login";
	public String productView="/products/alpha";
	public String addToWishlist="/shoppers/{shopperId}/wishlist";
	public String deleteFromWishlist="/shoppers/{shopperId}/wishlist/{productId}";
	

}
