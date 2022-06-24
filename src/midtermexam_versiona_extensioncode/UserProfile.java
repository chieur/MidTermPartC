package midtermexam_versiona_extensioncode;

// comment for question 5

/**
	The user profile for the OnlineVids system.
	The user has a userID and a favorite genre that must be one of the choices in the genres array.
	This code is to be used for SYST 17796 midterm exam.
	Students are reminded to add themselves as modifiers when editing the code.
	@author dancye, 2019
 */
public class UserProfile {
	private String userID;// the userID
	private Genre genre;// the user's preferred genre of movie

	/**
		a constructor that takes in the userID and the favorite genre
		@param givenID the ID to assign to this user
		@param givenGenre the users favorite genre
	*/
	public UserProfile(String givenID, Genre givenGenre) {
		userID = givenID;
		genre = givenGenre;
	}

	/**
		a getter for the userID
		@return the userID
	*/
	public String getUserID() {
		return userID;
	}

	/**
		@param userID the userID to set
	*/
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
		a getter for the genre
		@return the genre
	*/
	public Genre getGenre() {
		return genre;
	}

	/**
		@param genre the genre to set
	*/
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
}//end class
