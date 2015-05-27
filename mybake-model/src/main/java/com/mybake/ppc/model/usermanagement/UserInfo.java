package com.mybake.ppc.model.usermanagement;

import java.util.List;

import com.mybake.ppc.model.common.Address;
import com.mybake.ppc.model.common.PersonName;
import com.mybake.ppc.model.common.PhoneNumber;

public class UserInfo {
	private PersonName personName;
	private List<PhoneNumber> phoneNumbers;
	private List<Address> addresses;

	public UserInfo() {

	}

	public PersonName getPersonName() {
		return personName;
	}

	public void setPersonName(PersonName personName) {
		this.personName = personName;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
