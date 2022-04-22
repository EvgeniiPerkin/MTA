<#import "shared/common.ftlh" as c>

<@c.page>
	<table class="table table-striped">
	    <thead>
	    <tr>
	        <th>Номер заявки</th>
	        <th>Дата</th>
	        <th>Сумма</th>
	        <th>Исполнитель</th>
	        <th>Заказчик</th>
	    </tr>
	    </thead>
	    <tbody>
	    <#list orders as o>
	        <tr>
	            <td><#if o.orderNumber??>${o.orderNumber}</#if></td>
	            <td><#if o.dateOrder??>${o.dateOrder}</#if></td>
	            <td><#if o.cost??>${o.cost}</#if></td>
	            <td><#if o.executor.executorName??>${o.executor.executorName}</#if></td>
	            <td><#if o.customer.customerName??>${o.customer.customerName}</#if></td>
	        </tr>
	    </#list>
	    </tbody>
	</table> 
</@c.page>