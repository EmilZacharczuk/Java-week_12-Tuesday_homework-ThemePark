package themePark;

import interfaces.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviewedSites;

    public ThemePark() {
        this.reviewedSites = new ArrayList<>();
    }

    public int getAllReviewed() {
        return reviewedSites.size();
    }

    public void addSite(IReviewed site) {
        reviewedSites.add(site);
    }
}
