public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    private static Contacts contactsDao;

    public static Contacts getContactsDao() {
        if (contactsDao == null) {
            contactsDao = new ContactListDao();
        }
            return contactsDao;
    }
}

