package au.edu.unsw.infs3634.beers;

import java.util.ArrayList;

public class BeersResponseData {

    private int currentPage;
    private int numberOfPages;
    private int totalResults;
    private ArrayList<Beer> data;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<Beer> getData() {
        return data;
    }

    public void setData(ArrayList<Beer> data) {
        this.data = data;
    }
}
