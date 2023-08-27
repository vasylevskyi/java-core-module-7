package ua.goit;

/**
 * Task 3
 **/
public class GooSearchResult {
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public String parseDomain() {
        String url = new String(getUrl());
        String[] domain = new String[0];
        if (url.startsWith("https://")) {
            domain = url.substring(8).split("/");
        }
        if (url.startsWith("http://")) {
            domain = url.substring(7).split("/");

        }
        return domain[0];
    }


}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars/=asdgsdgt122/sadtusghl").parseDomain());
    }
}
