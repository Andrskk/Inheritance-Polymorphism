package PhysicalAddress;

//-------------------------------------
// Part: 1
// Written by: Andrei Skachkou 40134189
//-------------------------------------

import EAddress.EmailAddress;

/**
 * Locale class contains specific information of Locale object.
 */
public class Locale {

    //Instance variable initialization
    protected String alphCountryCode;
    protected int numCountryCode;
    protected String countryName;

    //Parameterized constructor
    public Locale(String alphCountryCode, int numCountryCode, String countryName)
    {
        this.alphCountryCode = alphCountryCode;
        this.numCountryCode = numCountryCode;
        this.countryName = countryName;
    }

    /**
     * Method to get alphCountryCode.
     * @return alphCountryCode as a String.
     */
    public String getAlphCountryCode()
    {
        return alphCountryCode;
    }

    /**
     * Method to set alphCountryCode.
     * @param alphCountryCode Receives alphCountryCode as a String and assigns it to "this" alphCountryCode.
     */
    public void setAlphCountryCode(String alphCountryCode)
    {
        this.alphCountryCode = alphCountryCode;
    }

    /**
     * Method to get numCountryCode.
     * @return numCountryCode as an integer.
     */
    public int getNumCountryCode()
    {
        return numCountryCode;
    }

    /**
     * Method to set numCountryCode.
     * @param numCountryCode Receives numCountryCode and assigns it to "this" numCountryCode.
     */
    public void setNumCountryCode(int numCountryCode)
    {
        this.numCountryCode = numCountryCode;
    }

    /**
     * Method to get countryName.
     * @return countryName as a String.
     */
    public String getCountryName()
    {
        return countryName;
    }

    /**
     * Method to set countryName.
     * @param countryName Receives countryName and assigns it to "this" countryName.
     */
    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    /**
     * Overridden equals method to compare two objects of Locale type.
     * @param anotherObject Receives a parameter of class Object, then cast it to Locale type.
     * Compare it with "this" object parameters.
     * @return false, if passing object is null or has a different class type, return true, if all object attributes are
     * equal.
     */
    public boolean equals(Object anotherObject)
    {
        if ((anotherObject!=null)&&(getClass()==anotherObject.getClass()))
        {
            Locale anotherLocalAddress = (Locale) anotherObject;
            return this.alphCountryCode.equals(anotherLocalAddress.getAlphCountryCode())
                    &&this.numCountryCode==(anotherLocalAddress.getNumCountryCode())
                    &&this.countryName.equals(anotherLocalAddress.getCountryName());
        }
        else return false;
    }
    /**
     * toString method to display Locale information.
     * @return all Locale information as a String.
     */
    public String toString()
    {
        return " \""+getAlphCountryCode()+"\" "+getNumCountryCode()+" "+"\""+getCountryName()+"\"";
    }
}
