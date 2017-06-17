### This project is thought to provide the possibility of capturing credit cards

> Example 

``java
	EniumCardType a = EniumCardType.detect("56565656565656565656");
	switch (a){
	    case MASTERCARD:
	        break;
	    case VISA:
	        break;
	    case UNKNOWN:
	        break;
	}
``