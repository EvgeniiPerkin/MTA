<#import "shared/common.ftlh" as c>
<#import "shared/login.ftlh" as l>

<@c.page>
	<table class="table table-striped">
	    <thead>
		    <tr>
		        <th>№ Заявки</th>
		        <th>Дата</th>
		        <th>Сумма</th>
		        <th>Исполнитель</th>
		        <th>Заказчик</th>
		        <th>Изменить</th>
		        <th>Удалить</th>
		    </tr>
	    </thead>
	    <tbody>
	    <#list orders as o>
	        <tr>
	            <td><#if o.orderNumber??>${o.orderNumber}</#if></td>
	            <td><#if o.orderNumber??>${o.dateOrder?string('yyyy-MM-dd HH:mm:ss')}</#if></td>
	            <td><#if o.cost??>${o.cost}</#if></td>
	            <td><#if o.executor.executorName??>${o.executor.executorName}</#if></td>
	            <td><#if o.customer.customerName??>${o.customer.customerName}</#if></td>
	            <td><button type="submit" class="btn btn-primary">Изменить</button></td>
	            <td><button type="submit" class="btn btn-primary">Удалить</button></td>
	        </tr>
	    </#list>
	    </tbody>
	</table> 
</@c.page>