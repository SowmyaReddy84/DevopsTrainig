



  <div class="row">
<div class="page-header">
<div>
<h2 style="color:black" font-weight:100%;><strong>PRODUCT DETAILS TABLE</strong></h2>
</div>
</div>
</div>
  <table class="table table-bordered">
    <thead>
      <tr>
        <th><h3 style=color:black;><strong>USER ID</strong></h3></th> 
          <th><h3 style=color:black;><strong>DISCREPTION</strong></h3></th> 
        <th><h3 style=color:black;><strong>PRODUCT PRICE</strong></h3></th>
        <th><h3 style=color:black;><strong>USER NAME</strong></h3></th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    
    <c:forEach var="pro" items="${pList}" varStatus="status">
    
      <tr>
          <td><h4 style=color:black;>${pro.pid}</h4></td>
          <td><h4 style=color:black;>${pro.pname}</h4></td>
        <td><h4 style=color:black;>${pro.price}</h4></td>
      <!--   <td><h4 style=color:black;>${pro.category}</h4></td>--> 
          
          <td>
            <p>
            
            
            <a href = "edit.do?Id=${pro.pid}" class = "btn btn-primary" role = "button">
               EDIT
            </a> 
            
            <a href = "del.do?Id=${pro.pid}" class = "btn btn-primary" role = "button">
               DELETE
            </a>
         </p>  
          </td>
      </tr>
      </c:forEach>
        </tbody>
  </table>


