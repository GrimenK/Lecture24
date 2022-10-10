package webdriver;

import pageObject.*;

public class ObjectManager {
    private static ObjectManager instance;

    private ObjectManager(){}

    public static ObjectManager getInstance(){
        if(instance == null){
            instance = new ObjectManager();
        }
        return instance;
    }

    private RozetkaHeaderPannel rozetkaHeaderPannel;

    public RozetkaHeaderPannel getRozetkaHeaderPannel(){if (rozetkaHeaderPannel== null){rozetkaHeaderPannel = new RozetkaHeaderPannel();} return rozetkaHeaderPannel;}

    private CatalogPage catalogPage;

    public CatalogPage getCatalogPage(){if (catalogPage== null){catalogPage = new CatalogPage();} return catalogPage;}

    private CartPopup cartPopup;

    public CartPopup getCartPopup(){if (cartPopup== null){cartPopup = new CartPopup();} return cartPopup;}

    private ItemPage itemPage;

    public ItemPage getItemPage(){if (itemPage== null){itemPage = new ItemPage();} return itemPage;}

    private CheckoutPage checkoutPage;

    public CheckoutPage getCheckoutPage(){if (checkoutPage== null){checkoutPage = new CheckoutPage();} return checkoutPage;}

    private FilterTab filterTab;

    public FilterTab getFilterTab(){if (filterTab== null){filterTab = new FilterTab();} return filterTab;}

}
