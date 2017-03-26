package cput.ac.za.QUESTION1.ListCollection;

import java.awt.*;
/**
 * Created by Mandisi on 3/21/2017.
 */
public class ListClients {
    List clients = new List();

    public void addClients(String names)
    {
        clients.add(names);
    }
    public void removeClients(String names)
    {
        clients.remove(names);
    }
}
