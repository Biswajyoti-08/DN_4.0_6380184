interface Stock{
    void register(Observer obj);
    void deregister(Observer obj);
    void notifyObserver(); 
}