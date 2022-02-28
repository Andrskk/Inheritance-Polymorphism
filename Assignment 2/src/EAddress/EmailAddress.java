package EAddress;

import BaseAddress.Address;

//-------------------------------------
// Part: 1
// Written by: Andrei Skachkou 40134189
//-------------------------------------

/**
 * EmailAddress subclass inherited from Address class. Contains specific information of EmailAddress object.
 * Overrides equals method to compare two objects and toString method to display object information.
 */
public class EmailAddress extends Address {

    //Instance variables initialization
    private String userName;
    private String domain;
    private String tld;

    //Default constructor
    public EmailAddress()
    {
        super();
    }

    //Copy constructor
    public EmailAddress(EmailAddress anotherEmailAddress)
    {
        this.userName=anotherEmailAddress.getUserName();
        this.domain=anotherEmailAddress.getDomain();
        this.tld=anotherEmailAddress.getTld();
    }

    //Parameterized constructor
    public EmailAddress(String validFrom, String validTo, String userName,
                        String domain, String tld)
    {
        super(validFrom, validTo);
        this.userName = userName;
        this.domain = domain;
        this.tld = tld;
    }

    /**
     * Method to get user name.
     * @return user name as a String
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * Method to set user name.
     * @param userName Receives user name as a String and assigns it to "this" user name.
     */
    public void setUserName(String userName)
    {
        this.userName=userName;
    }

    /**
     * Method to get domain.
     * @return domain as a String
     */
    public String getDomain()
    {
        return domain;
    }

    /**
     * Method to set domain.
     * @param domain Receives a domain as a String and assigns it to "this" domain.
     */
    public void setDomain(String domain)
    {
        this.domain = domain;
    }

    /**
     * Method to get top level domain.
     * @return tld as a String.
     */
    public String getTld()
    {
        return tld;
    }

    /**
     * Method to set top level domain.
     * @param tld Receives a tld as a String and assigns it to "this" tld.
     */
    public void setTld(String tld)
    {
        this.tld = tld;
    }

    /**
     * Overridden equals method to compare two objects of EmailAddress type.
     * @param anotherObject Receives a parameter of class Object, then cast it to EmailAddress type. Compare it with "this"
     * object parameters.
     * @return false, if passing object is null or has a different class type, return true, if all object attributes are
     * equal.
     */
    public boolean equals(Object anotherObject)
    {
        if ((anotherObject!=null)&&(getClass()==anotherObject.getClass()))
        {
            EmailAddress anotherEmailAddress = (EmailAddress) anotherObject;
            return this.userName.equals(anotherEmailAddress.getUserName())
                    &&this.domain.equals(anotherEmailAddress.getDomain())
                    &&this.tld.equals(anotherEmailAddress.getTld());
        }
        else return false;
    }

    /**
     * Method to change user name in order to add a point between first name and last name.
     * @return new user name with the point between first name and last name as a String.
     */
    private String nameChange()
    {
        String beforePoint="";
        String afterPoint="";
        String result="";

        for (int i=0;i<this.userName.length();i++)
        {
            if (this.userName.charAt(i)==' ')
            {
                beforePoint=this.userName.substring(0,i);
                afterPoint=this.userName.substring(i+1);
                result+=beforePoint+"."+afterPoint;
            }
        }
        return result;
    }

    /**
     * Overridden toString method to display an EmailAddress information.
     * @return all EmailAddress information as a String plus obsolete information.
     */
    public String toString()
    {
        String result="";
        result+=super.toString()+" email address: "+ nameChange()+"@"+getDomain()+"."+getTld()+" is valid from "+super.validFrom
        +" to "+super.validTo+", therefore ";

        if (super.isObsolete)result+="it is not usable today.";
        else result+="it is still usable today.";
        return result;
    }

    /**
     * Method to display an email address information.
     * @return all EmailAddress information as a String.
     */
    public String display()
    {
        return "This email address: \n"+ nameChange()+"@"+getDomain()+"."+getTld();
    }
}
