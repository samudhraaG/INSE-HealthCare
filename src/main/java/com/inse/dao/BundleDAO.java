package com.inse.dao;

import com.inse.com.model.Bundle;

import java.util.List;

/**
 * Created by ssamudhraa on 4/7/2017.
 */
public interface BundleDAO {
    public void save(Bundle bundle);
    public List<Bundle> listBundles();
}
