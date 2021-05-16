public class Main {

	public static void main(String[] args) {
		User user1 = new IndividualUser();
		user1.setId(0);
		user1.setFirstName("Ahmet Burak");
		user1.setLastName("Fırat");
		user1.setEmail("ahmetburakfirat@gmail.com");
		user1.setAge(23);
		user1.setRegion("Turkey");
		user1.setPassword("12345");
		
		UserManager userManager1 = new IndividualUserManager();
		userManager1.add(user1);
		userManager1.update(user1);
		userManager1.delete(user1);
		

		System.out.println("*********************");
		
		Campaign campaign1 = new Campaign(0, "tüm ürünlerde %25 indirim",25, 16, 20);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		campaignManager.updateCampaign(campaign1);
		campaignManager.deleteCampaign(campaign1);
		
		System.out.println("*********************");
		
		Game game1 = new Game(0, "GTA 5", "a blue image", 200, 10, 13);
		
		GameSalesManager gameManager = new GameSalesManager();
		gameManager.sell(user1, game1, campaign1);

	}

}
