package com.collections.customlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
    	 Customlist<Integer> list = new Customlist<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(78);
         list.add(34);
         list.add(32);
         list.add(100);
         LOGGER.info("List is :"+list);
         LOGGER.info("Retrived : "+list.get(3));
         LOGGER.info("Removed : "+list.get(3));
         list.remove(3);
         LOGGER.debug("Modified list : "+list);
         LOGGER.debug("Retrived : "+list.get(0) );
         LOGGER.debug("Retrived : "+list.get(1) );
         LOGGER.debug("Size of list : "+list.size());
         Customlist<String>list2=new Customlist<>();
         list2.add("Epam");
         list2.add("task");
         list2.add("value");
         list2.add("abcd");
         LOGGER.info("List is :"+list2);
         LOGGER.debug("Retrived : "+list2.get(0));
         LOGGER.debug("Size of list  : "+list2.size());
         LOGGER.info("Removed : "+list2.get(2));
         list2.remove(2);
         LOGGER.debug("Modified list : "+list2);
    }
}
