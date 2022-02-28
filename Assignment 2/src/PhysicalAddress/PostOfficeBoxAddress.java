package PhysicalAddress;

import BaseAddress.Address;

/**
 * PostOfficeBoxAddress subclass inherited from GeographicAddress class. Contains specific information of PostOfficeBoxAddress
 * object.
 * Overrides equals method to compare two objects and toString method to display object information.
 */
public class PostOfficeBoxAddress extends GeographicAddress {

    //Instance variable initialization
    private Locale locale;
    private int boxLobbyDoorCode;

    //Default constructor
    public PostOfficeBoxAddress()
    {
        super();
    }

    //Copy constructor
    public PostOfficeBoxAddress(PostOfficeBoxAddress anotherPostOfficeBoxAddress)
    {
        this.locale=anotherPostOfficeBoxAddress.getLocale();
        this.boxLobbyDoorCode=anotherPostOfficeBoxAddress.getBoxLobbyDoorCode();
    }

    //Parameterized constructor
    public PostOfficeBoxAddress(String validFrom, String validTo, String addressLine,
                                String city, String regionOrState, String zipOrPostCode, Locale locale,
                                int boxLobbyDoorCode)
    {
        super(validFrom,validTo,locale,addressLine,city,regionOrState,zipOrPostCode);
        this.locale = locale;
        this.boxLobbyDoorCode = boxLobbyDoorCode;
    }

    /**
     * Method to get locale.
     * @return locale as a Locale class type.
     */
    public Locale getLocale()
    {
        return locale;
    }

    /**
     * Method to set locale.
     * @param locale Receives a variable of Locale type and assigns it to "this" locale.
     */
    public void setLocale(Locale locale)
    {
        this.locale = locale;
    }

    /**
     * Method to get BoxLobbyDoorCode.
     * @return BoxLobbyDoorCode as an integer.
     */
    public int getBoxLobbyDoorCode()
    {
        return boxLobbyDoorCode;
    }

    /**
     * Method to set BoxLobbyDoorCode.
     * @param boxLobbyDoorCode Receives a BoxLobbyDoorCode as an integer and assigns it to "this" BoxLobbyDoorCode.
     */
    public void setBoxLobbyDoorCode(int boxLobbyDoorCode)
    {
        this.boxLobbyDoorCode = boxLobbyDoorCode;
    }

    /**
     * Overridden equals method to compare two objects of PostOfficeBoxAddress type.
     * @param anotherObject Receives a parameter of class Object, then cast it to PostOfficeBoxAddress type.
     * Compare it with "this" object parameters.
     * @return false, if passing object is null or has a different class type, return true, if all object attributes are
     * equal.
     */
    public boolean equals(Object anotherObject)
    {
        if ((anotherObject!=null)&&(getClass()==anotherObject.getClass()))
        {
            PostOfficeBoxAddress anotherPostOfficeBoxAddress = (PostOfficeBoxAddress) anotherObject;

            return this.locale.equals(anotherPostOfficeBoxAddress.getLocale())&&this.boxLobbyDoorCode==anotherPostOfficeBoxAddress.getBoxLobbyDoorCode();
        }
        else return false;
    }

    /**
     * Overridden toString method to display an PostOfficeBoxAddress information.
     * @return all PostOfficeBoxAddress information as a String plus obsolete information.
     */
    public String toString()
    {
        String result="";
        result+="This post office box address: "+ super.getAddressLine()+" "+super.getCity()+" "
                +super.getRegionOrState()+" "+super.getZipOrPostCode()+" is valid from "+super.validFrom
                +" to "+super.validTo+", therefore ";

        if (super.isObsolete)result+="it is not usable today.";
        else result+="it is still usable today.";
        return result;
    }

    /**
     * Method to display an PostOfficeBoxAddress information.
     * @return all PostOfficeBoxAddress information as a String.
     */
    public String display()
    {
        return "This post office box address: \n"+getAddressLine()+", "+getCity()+", "+getRegionOrState()
                +", "+getZipOrPostCode()+" Locale:"+getLocale();
    }
}
