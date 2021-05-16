public class CampaignManager {
	void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya kaydedildi.");
	}
	void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya silindi.");
	}
	void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya güncellendi.");
	}
}
