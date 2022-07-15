package Nine;

import java.util.*;
public class PersonName
{
    ArrayList<Contact> personName=new ArrayList<Contact>();
     
    public void addContact(Contact contactObj)
    {
    	personName.add(contactObj);
    }
    public List<Contact> viewAllContacts()
    {
        return personName;
    }
    public boolean removeName(String n1)
    {
        for(Contact obj:personName)
        {
			if(obj.getFirstName().equals(n1))
            {      
				personName.remove(n1);
                break;
            }
			else
			{
				return false;
			}
        }
        return true;
    }    
}