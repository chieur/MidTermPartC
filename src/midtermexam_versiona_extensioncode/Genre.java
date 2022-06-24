package midtermexam_versiona_extensioncode;

/**
	@author chieur (Ricky Chieu), 991625137
*/
public enum Genre{
		comedy("Comedy"),
		drama("Drama"),
		action("Action"),
		mystery("Mystery");

		private final String name;

		Genre(String name){
			this.name=name;
		}

		public String get_name(){
			return name;
		}
	}// available genres of movies