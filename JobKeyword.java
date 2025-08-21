   package com.example.ai.entity;

   import javax.persistence.Entity;
   import javax.persistence.Id;

   @Entity
   public class JobKeyword {
       @Id
       private Long id;
       private String keyword;
       private int weight;

       // Getters and Setters
       public Long getId() {
           return id;
       }

       public void setId(Long id) {
           this.id = id;
       }

       public String getKeyword() {
           return keyword;
       }

       public void setKeyword(String keyword) {
           this.keyword = keyword;
       }

       public int getWeight() {
           return weight;
       }

       public void setWeight(int weight) {
           this.weight = weight;
       }
   }
   