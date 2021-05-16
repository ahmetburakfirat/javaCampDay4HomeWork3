public class GameSalesManager implements SalesManager{

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı " + game.getName() + " oyununu "
				+ campaign.getName() + " kapmanyasından yararlanarak satın aldı!");
		
	}
	

}
