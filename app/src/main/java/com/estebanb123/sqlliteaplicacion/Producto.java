package com.estebanb123.sqlliteaplicacion;


public class Producto {

        private int _id;
        private String _productName;

        public Producto(){

        }

        public Producto(String _productName){
            this._productName=_productName;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        public void set_productName(String _productName) {
            this._productName = _productName;
        }

        public int get_id() {
            return _id;
        }

        public String get_productName() {
            return _productName;
        }
}
