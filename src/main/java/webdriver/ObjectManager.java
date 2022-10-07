package webdriver;

import pageObject.RozetkaHeaderPannel;

public class ObjectManager {

    private RozetkaHeaderPannel rozetkaHeaderPannel;

    public RozetkaHeaderPannel getRozetkaHeaderPannel(){if (rozetkaHeaderPannel== null){rozetkaHeaderPannel = new RozetkaHeaderPannel();} return rozetkaHeaderPannel;}


}
