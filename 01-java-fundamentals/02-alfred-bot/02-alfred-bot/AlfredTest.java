public class AlfredTest {


    public static void main(String[] args) {

        AlfredQuotes alfredBot = new AlfredQuotes();
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Kevin", "afternoon");
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some Disma");
        String alfredTest = alfredBot.respondBeforeAlexis("Maybe Alfred knows where my battle-axe is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning, but rather failing..");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }

}
