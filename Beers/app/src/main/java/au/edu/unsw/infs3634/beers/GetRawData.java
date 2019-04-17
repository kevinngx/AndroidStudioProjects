package au.edu.unsw.infs3634.beers;

class GetRawData {
    private static final String TAG = "GetRawData";


    public static String getTestJson() {

        String testJson = "{\n" +
                "      \"id\": \"c4f2KE\",\n" +
                "      \"name\": \"'Murican Pilsner\",\n" +
                "      \"nameDisplay\": \"'Murican Pilsner\",\n" +
                "      \"abv\": \"5.5\",\n" +
                "      \"glasswareId\": 4,\n" +
                "      \"styleId\": 98,\n" +
                "      \"isOrganic\": \"N\",\n" +
                "      \"isRetired\": \"N\",\n" +
                "      \"labels\": {\n" +
                "        \"icon\": \"https://brewerydb-images.s3.amazonaws.com/beer/c4f2KE/upload_jjKJ7g-icon.png\",\n" +
                "        \"medium\": \"https://brewerydb-images.s3.amazonaws.com/beer/c4f2KE/upload_jjKJ7g-medium.png\",\n" +
                "        \"large\": \"https://brewerydb-images.s3.amazonaws.com/beer/c4f2KE/upload_jjKJ7g-large.png\",\n" +
                "        \"contentAwareIcon\": \"https://brewerydb-images.s3.amazonaws.com/beer/c4f2KE/upload_jjKJ7g-contentAwareIcon.png\",\n" +
                "        \"contentAwareMedium\": \"https://brewerydb-images.s3.amazonaws.com/beer/c4f2KE/upload_jjKJ7g-contentAwareMedium.png\",\n" +
                "        \"contentAwareLarge\": \"https://brewerydb-images.s3.amazonaws.com/beer/c4f2KE/upload_jjKJ7g-contentAwareLarge.png\"\n" +
                "      },\n" +
                "      \"status\": \"verified\",\n" +
                "      \"statusDisplay\": \"Verified\",\n" +
                "      \"createDate\": \"2013-08-19 11:58:12\",\n" +
                "      \"updateDate\": \"2018-11-02 02:15:14\",\n" +
                "      \"glass\": {\n" +
                "        \"id\": 4,\n" +
                "        \"name\": \"Pilsner\",\n" +
                "        \"createDate\": \"2012-01-03 02:41:33\"\n" +
                "      },\n" +
                "      \"style\": {\n" +
                "        \"id\": 98,\n" +
                "        \"categoryId\": 8,\n" +
                "        \"category\": {\n" +
                "          \"id\": 8,\n" +
                "          \"name\": \"North American Lager\",\n" +
                "          \"createDate\": \"2012-03-21 20:06:46\"\n" +
                "        },\n" +
                "        \"name\": \"American-Style Pilsener\",\n" +
                "        \"shortName\": \"American Pilsener\",\n" +
                "        \"description\": \"This classic and unique pre-Prohibition American-style Pilsener is straw to deep gold in color. Hop bitterness, flavor and aroma are medium to high, and use of noble-type hops for flavor and aroma is preferred. Up to 25 percent corn and/or rice in the grist should be used. Malt flavor and aroma are medium. This is a light-medium to medium-bodied beer. Sweet corn-like dimethylsulfide (DMS), fruity esters and American hop-derived citrus flavors or aromas should not be perceived. Diacetyl is not acceptable. There should be no chill haze. Competition organizers may wish to subcategorize this style into rice and corn subcategories.\",\n" +
                "        \"ibuMin\": \"25\",\n" +
                "        \"ibuMax\": \"40\",\n" +
                "        \"abvMin\": \"5\",\n" +
                "        \"abvMax\": \"6\",\n" +
                "        \"srmMin\": \"3\",\n" +
                "        \"srmMax\": \"6\",\n" +
                "        \"ogMin\": \"1.045\",\n" +
                "        \"fgMin\": \"1.012\",\n" +
                "        \"fgMax\": \"1.018\",\n" +
                "        \"createDate\": \"2012-03-21 20:06:46\",\n" +
                "        \"updateDate\": \"2015-04-07 15:40:08\"\n" +
                "      },\n" +
                "      \"breweries\": [\n" +
                "        {\n" +
                "          \"id\": \"nHLlnK\",\n" +
                "          \"name\": \"Sierra Nevada Brewing Company\",\n" +
                "          \"nameShortDisplay\": \"Sierra Nevada\",\n" +
                "          \"description\": \"The Sierra Nevada Brewing Company was established in 1980 by homebrewers Ken Grossman and Paul Camusi. Camusi retired in 1998 and sold his share in the company to Grossman.\\r\\n\\r\\nLocated in Chico, California, Sierra Nevada Brewing is one of the most popular craft breweries currently operating in the United States. Its Pale Ale is world renowned, and the brewery produces almost 700,000 barrels of beer per year. Sierra Nevada's Pale Ale is the second best-selling craft beer in the United States, behind the Boston Beer Company's Samuel Adams Boston Lager.\\r\\n\\r\\nSierra Nevada's specialty brews include the winter seasonal Celebration, which is similar to the pale ale, but hoppier; and Summerfest, a lager which is citrusy and sunny.\",\n" +
                "          \"website\": \"http://www.sierranevada.com/\",\n" +
                "          \"established\": \"1980\",\n" +
                "          \"isOrganic\": \"N\",\n" +
                "          \"images\": {\n" +
                "            \"icon\": \"https://brewerydb-images.s3.amazonaws.com/brewery/nHLlnK/upload_IClwuZ-icon.png\",\n" +
                "            \"medium\": \"https://brewerydb-images.s3.amazonaws.com/brewery/nHLlnK/upload_IClwuZ-medium.png\",\n" +
                "            \"large\": \"https://brewerydb-images.s3.amazonaws.com/brewery/nHLlnK/upload_IClwuZ-large.png\",\n" +
                "            \"squareMedium\": \"https://brewerydb-images.s3.amazonaws.com/brewery/nHLlnK/upload_IClwuZ-squareMedium.png\",\n" +
                "            \"squareLarge\": \"https://brewerydb-images.s3.amazonaws.com/brewery/nHLlnK/upload_IClwuZ-squareLarge.png\"\n" +
                "          },\n" +
                "          \"status\": \"verified\",\n" +
                "          \"statusDisplay\": \"Verified\",\n" +
                "          \"createDate\": \"2012-01-03 02:42:08\",\n" +
                "          \"updateDate\": \"2018-11-02 02:15:01\",\n" +
                "          \"isMassOwned\": \"N\",\n" +
                "          \"isInBusiness\": \"Y\",\n" +
                "          \"isVerified\": \"N\",\n" +
                "          \"locations\": [\n" +
                "            {\n" +
                "              \"id\": \"IaQrxj\",\n" +
                "              \"name\": \"Main Brewery\",\n" +
                "              \"streetAddress\": \"1075 East 20th St\",\n" +
                "              \"locality\": \"Chico\",\n" +
                "              \"region\": \"California\",\n" +
                "              \"postalCode\": \"95928\",\n" +
                "              \"phone\": \"530-893-3520\",\n" +
                "              \"website\": \"http://www.sierranevada.com/\",\n" +
                "              \"latitude\": 39.7246028,\n" +
                "              \"longitude\": -121.8157154,\n" +
                "              \"isPrimary\": \"Y\",\n" +
                "              \"inPlanning\": \"N\",\n" +
                "              \"isClosed\": \"N\",\n" +
                "              \"openToPublic\": \"Y\",\n" +
                "              \"locationType\": \"micro\",\n" +
                "              \"locationTypeDisplay\": \"Micro Brewery\",\n" +
                "              \"countryIsoCode\": \"US\",\n" +
                "              \"yearOpened\": \"1980\",\n" +
                "              \"status\": \"verified\",\n" +
                "              \"statusDisplay\": \"Verified\",\n" +
                "              \"createDate\": \"2012-01-03 02:42:08\",\n" +
                "              \"updateDate\": \"2018-11-02 02:14:56\",\n" +
                "              \"country\": {\n" +
                "                \"isoCode\": \"US\",\n" +
                "                \"name\": \"UNITED STATES\",\n" +
                "                \"displayName\": \"United States\",\n" +
                "                \"isoThree\": \"USA\",\n" +
                "                \"numberCode\": 840,\n" +
                "                \"createDate\": \"2012-01-03 02:41:33\"\n" +
                "              }\n" +
                "            },\n" +
                "            {\n" +
                "              \"id\": \"aqLvLE\",\n" +
                "              \"name\": \"Asheville\",\n" +
                "              \"streetAddress\": \"100 Sierra Nevada Way\",\n" +
                "              \"locality\": \"Fletcher\",\n" +
                "              \"region\": \"North Carolina\",\n" +
                "              \"postalCode\": \"28732\",\n" +
                "              \"latitude\": 35.4303824,\n" +
                "              \"longitude\": -82.5489214,\n" +
                "              \"isPrimary\": \"N\",\n" +
                "              \"inPlanning\": \"N\",\n" +
                "              \"isClosed\": \"N\",\n" +
                "              \"openToPublic\": \"Y\",\n" +
                "              \"locationType\": \"micro\",\n" +
                "              \"locationTypeDisplay\": \"Micro Brewery\",\n" +
                "              \"countryIsoCode\": \"US\",\n" +
                "              \"status\": \"verified\",\n" +
                "              \"statusDisplay\": \"Verified\",\n" +
                "              \"createDate\": \"2012-03-29 20:56:05\",\n" +
                "              \"updateDate\": \"2018-11-02 02:14:56\",\n" +
                "              \"timezoneId\": \"America/New_York\",\n" +
                "              \"country\": {\n" +
                "                \"isoCode\": \"US\",\n" +
                "                \"name\": \"UNITED STATES\",\n" +
                "                \"displayName\": \"United States\",\n" +
                "                \"isoThree\": \"USA\",\n" +
                "                \"numberCode\": 840,\n" +
                "                \"createDate\": \"2012-01-03 02:41:33\"\n" +
                "              }\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    }";

        return testJson;
    }



}
