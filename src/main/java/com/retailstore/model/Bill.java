/*
 * package com.cg.retailstore.model;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.ForeignKey; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.OneToOne; import
 * javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "bill_table") public class Bill {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column private long bill_id;
 * 
 * @Column private String products_name;
 * 
 * @Column private String customer_name;
 * 
 * 
 * @Column private long total_bill_cost;
 * 
 * @OneToOne
 * 
 * @JoinColumn(foreignKey=@ForeignKey(name="customer_id"))
 * 
 * 
 * @Column private Retailer customer;
 * 
 * public long getBill_id() { return bill_id; }
 * 
 * public void setBill_id(long bill_id) { this.bill_id = bill_id; }
 * 
 * public String getProducts_name() { return products_name; }
 * 
 * public void setProducts_name(String products_name) { this.products_name =
 * products_name; }
 * 
 * public String getCustomer_name() { return customer_name; }
 * 
 * public void setCustomer_name(String customer_name) { this.customer_name =
 * customer_name; }
 * 
 * public long getTotal_bill_cost() { return total_bill_cost; }
 * 
 * public void setTotal_bill_cost(long total_bill_cost) { this.total_bill_cost =
 * total_bill_cost; }
 * 
 * public Retailer getCustomer() { return customer; }
 * 
 * public void setCustomer(Retailer customer) { this.customer = customer; }
 * 
 * 
 * }
 */
