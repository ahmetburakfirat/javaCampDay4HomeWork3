public class IndividualUserManager implements UserManager{

	@Override
	public void add(User user) {
		if(UserCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı bilgileri eklendi.");
		}else {
			System.out.println("Bilgiler doğrulanamadı.");
		}
		
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı bilgileri güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı bilgileri silindi.");
		
	}
	

}
