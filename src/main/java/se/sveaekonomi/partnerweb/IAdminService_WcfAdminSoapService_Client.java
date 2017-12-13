
package se.sveaekonomi.partnerweb;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-12-13T11:32:42.477+01:00
 * Generated source version: 3.2.0
 * 
 */
public final class IAdminService_WcfAdminSoapService_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "AdminService");

    private IAdminService_WcfAdminSoapService_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AdminService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AdminService ss = new AdminService(wsdlURL, SERVICE_NAME);
        IAdminService port = ss.getWcfAdminSoapService();  
        
        {
        System.out.println("Invoking getOrders...");
        se.sveaekonomi.partnerweb.GetOrdersRequest _getOrders_request = null;
        se.sveaekonomi.partnerweb.GetOrdersResponse2 _getOrders__return = port.getOrders(_getOrders_request);
        System.out.println("getOrders.result=" + _getOrders__return);


        }
        {
        System.out.println("Invoking deliverPartial...");
        se.sveaekonomi.partnerweb.PartialDeliveryRequest _deliverPartial_request = null;
        se.sveaekonomi.partnerweb.DeliveryResponse _deliverPartial__return = port.deliverPartial(_deliverPartial_request);
        System.out.println("deliverPartial.result=" + _deliverPartial__return);


        }
        {
        System.out.println("Invoking getPaymentPlanReport...");
        se.sveaekonomi.partnerweb.GetPaymentPlanReportRequest _getPaymentPlanReport_request = null;
        se.sveaekonomi.partnerweb.GetPaymentPlanReportResponse2 _getPaymentPlanReport__return = port.getPaymentPlanReport(_getPaymentPlanReport_request);
        System.out.println("getPaymentPlanReport.result=" + _getPaymentPlanReport__return);


        }
        {
        System.out.println("Invoking getSpecificationReport...");
        se.sveaekonomi.partnerweb.GetSpecificationReportRequest _getSpecificationReport_request = null;
        se.sveaekonomi.partnerweb.GetSpecificationReportResponse2 _getSpecificationReport__return = port.getSpecificationReport(_getSpecificationReport_request);
        System.out.println("getSpecificationReport.result=" + _getSpecificationReport__return);


        }
        {
        System.out.println("Invoking createApprovedOrder...");
        se.sveaekonomi.partnerweb.CreateApprovedOrderRequest _createApprovedOrder_request = null;
        se.sveaekonomi.partnerweb.CreateApprovedOrderResponse2 _createApprovedOrder__return = port.createApprovedOrder(_createApprovedOrder_request);
        System.out.println("createApprovedOrder.result=" + _createApprovedOrder__return);


        }
        {
        System.out.println("Invoking changeInvoiceDueDate...");
        se.sveaekonomi.partnerweb.ChangeInvoiceDueDateRequest _changeInvoiceDueDate_request = null;
        se.sveaekonomi.partnerweb.ChangeInvoiceDueDateResponse2 _changeInvoiceDueDate__return = port.changeInvoiceDueDate(_changeInvoiceDueDate_request);
        System.out.println("changeInvoiceDueDate.result=" + _changeInvoiceDueDate__return);


        }
        {
        System.out.println("Invoking getAccountingReport...");
        se.sveaekonomi.partnerweb.GetAccountingReportRequest _getAccountingReport_request = null;
        se.sveaekonomi.partnerweb.GetAccountingReportResponse2 _getAccountingReport__return = port.getAccountingReport(_getAccountingReport_request);
        System.out.println("getAccountingReport.result=" + _getAccountingReport__return);


        }
        {
        System.out.println("Invoking generateAccountCreditRegressReport...");
        se.sveaekonomi.partnerweb.AccountCreditRegressReportRequest _generateAccountCreditRegressReport_request = null;
        se.sveaekonomi.partnerweb.AccountCreditRegressReportResponse _generateAccountCreditRegressReport__return = port.generateAccountCreditRegressReport(_generateAccountCreditRegressReport_request);
        System.out.println("generateAccountCreditRegressReport.result=" + _generateAccountCreditRegressReport__return);


        }
        {
        System.out.println("Invoking cancelPaymentPlanAmount...");
        se.sveaekonomi.partnerweb.CancelPaymentPlanAmountRequest _cancelPaymentPlanAmount_request = null;
        se.sveaekonomi.partnerweb.CancelPaymentPlanAmountResponse2 _cancelPaymentPlanAmount__return = port.cancelPaymentPlanAmount(_cancelPaymentPlanAmount_request);
        System.out.println("cancelPaymentPlanAmount.result=" + _cancelPaymentPlanAmount__return);


        }
        {
        System.out.println("Invoking searchAccountCredits...");
        se.sveaekonomi.partnerweb.SearchAccountCreditsRequest _searchAccountCredits_request = null;
        se.sveaekonomi.partnerweb.SearchAccountCreditsResponse2 _searchAccountCredits__return = port.searchAccountCredits(_searchAccountCredits_request);
        System.out.println("searchAccountCredits.result=" + _searchAccountCredits__return);


        }
        {
        System.out.println("Invoking getFinancialReport...");
        se.sveaekonomi.partnerweb.GetFinancialReportRequest _getFinancialReport_request = null;
        se.sveaekonomi.partnerweb.GetFinancialReportResponse2 _getFinancialReport__return = port.getFinancialReport(_getFinancialReport_request);
        System.out.println("getFinancialReport.result=" + _getFinancialReport__return);


        }
        {
        System.out.println("Invoking getOrderPdfLink...");
        se.sveaekonomi.partnerweb.GetOrderPdfLinkRequest _getOrderPdfLink_request = null;
        se.sveaekonomi.partnerweb.PdfLinkResponse _getOrderPdfLink__return = port.getOrderPdfLink(_getOrderPdfLink_request);
        System.out.println("getOrderPdfLink.result=" + _getOrderPdfLink__return);


        }
        {
        System.out.println("Invoking generateAccountingAgreementType25Report...");
        se.sveaekonomi.partnerweb.AccountingAgreementType25ReportRequest _generateAccountingAgreementType25Report_request = null;
        se.sveaekonomi.partnerweb.AccountingAgreementType25ReportResponse _generateAccountingAgreementType25Report__return = port.generateAccountingAgreementType25Report(_generateAccountingAgreementType25Report_request);
        System.out.println("generateAccountingAgreementType25Report.result=" + _generateAccountingAgreementType25Report__return);


        }
        {
        System.out.println("Invoking getSumOfOrderAmount...");
        se.sveaekonomi.partnerweb.SumOfOrderAmountRequest _getSumOfOrderAmount_request = null;
        se.sveaekonomi.partnerweb.SumOfAmountResponse _getSumOfOrderAmount__return = port.getSumOfOrderAmount(_getSumOfOrderAmount_request);
        System.out.println("getSumOfOrderAmount.result=" + _getSumOfOrderAmount__return);


        }
        {
        System.out.println("Invoking getInvoiceJournalReport...");
        se.sveaekonomi.partnerweb.GetInvoiceJournalReportRequest _getInvoiceJournalReport_request = null;
        se.sveaekonomi.partnerweb.GetInvoiceJournalReportResponse2 _getInvoiceJournalReport__return = port.getInvoiceJournalReport(_getInvoiceJournalReport_request);
        System.out.println("getInvoiceJournalReport.result=" + _getInvoiceJournalReport__return);


        }
        {
        System.out.println("Invoking getInvoicePdfLink...");
        se.sveaekonomi.partnerweb.GetInvoicePdfLinkRequest _getInvoicePdfLink_request = null;
        se.sveaekonomi.partnerweb.PdfLinkResponse _getInvoicePdfLink__return = port.getInvoicePdfLink(_getInvoicePdfLink_request);
        System.out.println("getInvoicePdfLink.result=" + _getInvoicePdfLink__return);


        }
        {
        System.out.println("Invoking cancelOrderRows...");
        se.sveaekonomi.partnerweb.CancelOrderRowsRequest _cancelOrderRows_request = null;
        se.sveaekonomi.partnerweb.CancelOrderRowsResponse2 _cancelOrderRows__return = port.cancelOrderRows(_cancelOrderRows_request);
        System.out.println("cancelOrderRows.result=" + _cancelOrderRows__return);


        }
        {
        System.out.println("Invoking updateOrderRows...");
        se.sveaekonomi.partnerweb.UpdateOrderRowsRequest _updateOrderRows_request = null;
        se.sveaekonomi.partnerweb.UpdateOrderRowsResponse2 _updateOrderRows__return = port.updateOrderRows(_updateOrderRows_request);
        System.out.println("updateOrderRows.result=" + _updateOrderRows__return);


        }
        {
        System.out.println("Invoking getInvoices...");
        se.sveaekonomi.partnerweb.GetInvoicesRequest _getInvoices_request = null;
        se.sveaekonomi.partnerweb.GetInvoicesResponse2 _getInvoices__return = port.getInvoices(_getInvoices_request);
        System.out.println("getInvoices.result=" + _getInvoices__return);


        }
        {
        System.out.println("Invoking cancelAccountCreditRows...");
        se.sveaekonomi.partnerweb.CancelAccountCreditRowsRequest _cancelAccountCreditRows_request = null;
        se.sveaekonomi.partnerweb.CancelAccountCreditRowsResponse2 _cancelAccountCreditRows__return = port.cancelAccountCreditRows(_cancelAccountCreditRows_request);
        System.out.println("cancelAccountCreditRows.result=" + _cancelAccountCreditRows__return);


        }
        {
        System.out.println("Invoking createOrder...");
        se.sveaekonomi.partnerweb.CreateOrderRequest _createOrder_request = null;
        se.sveaekonomi.partnerweb.CreateOrderResponse2 _createOrder__return = port.createOrder(_createOrder_request);
        System.out.println("createOrder.result=" + _createOrder__return);


        }
        {
        System.out.println("Invoking getSumOfPaymentPlanAmount...");
        se.sveaekonomi.partnerweb.SumOfPaymentPlanAmountRequest _getSumOfPaymentPlanAmount_request = null;
        se.sveaekonomi.partnerweb.SumOfAmountResponse _getSumOfPaymentPlanAmount__return = port.getSumOfPaymentPlanAmount(_getSumOfPaymentPlanAmount_request);
        System.out.println("getSumOfPaymentPlanAmount.result=" + _getSumOfPaymentPlanAmount__return);


        }
        {
        System.out.println("Invoking searchInvoices...");
        se.sveaekonomi.partnerweb.SearchInvoicesRequest _searchInvoices_request = null;
        se.sveaekonomi.partnerweb.SearchInvoicesResponse2 _searchInvoices__return = port.searchInvoices(_searchInvoices_request);
        System.out.println("searchInvoices.result=" + _searchInvoices__return);


        }
        {
        System.out.println("Invoking cancelOrder...");
        se.sveaekonomi.partnerweb.CancelOrderRequest _cancelOrder_request = null;
        se.sveaekonomi.partnerweb.CancelOrderResponse2 _cancelOrder__return = port.cancelOrder(_cancelOrder_request);
        System.out.println("cancelOrder.result=" + _cancelOrder__return);


        }
        {
        System.out.println("Invoking releasePendingOrder...");
        se.sveaekonomi.partnerweb.ReleasePendingRequest _releasePendingOrder_request = null;
        se.sveaekonomi.partnerweb.ReleasePendingResponse _releasePendingOrder__return = port.releasePendingOrder(_releasePendingOrder_request);
        System.out.println("releasePendingOrder.result=" + _releasePendingOrder__return);


        }
        {
        System.out.println("Invoking getInvoiceReport...");
        se.sveaekonomi.partnerweb.GetInvoiceReportRequest _getInvoiceReport_request = null;
        se.sveaekonomi.partnerweb.GetInvoiceReportResponse2 _getInvoiceReport__return = port.getInvoiceReport(_getInvoiceReport_request);
        System.out.println("getInvoiceReport.result=" + _getInvoiceReport__return);


        }
        {
        System.out.println("Invoking cancelAccountCreditAmount...");
        se.sveaekonomi.partnerweb.CancelAccountCreditAmountRequest _cancelAccountCreditAmount_request = null;
        se.sveaekonomi.partnerweb.CancelAccountCreditAmountResponse2 _cancelAccountCreditAmount__return = port.cancelAccountCreditAmount(_cancelAccountCreditAmount_request);
        System.out.println("cancelAccountCreditAmount.result=" + _cancelAccountCreditAmount__return);


        }
        {
        System.out.println("Invoking searchOrders...");
        se.sveaekonomi.partnerweb.SearchOrdersRequest _searchOrders_request = null;
        se.sveaekonomi.partnerweb.SearchOrdersResponse2 _searchOrders__return = port.searchOrders(_searchOrders_request);
        System.out.println("searchOrders.result=" + _searchOrders__return);


        }
        {
        System.out.println("Invoking searchPaymentPlans...");
        se.sveaekonomi.partnerweb.SearchPaymentPlansRequest _searchPaymentPlans_request = null;
        se.sveaekonomi.partnerweb.SearchPaymentPlansResponse2 _searchPaymentPlans__return = port.searchPaymentPlans(_searchPaymentPlans_request);
        System.out.println("searchPaymentPlans.result=" + _searchPaymentPlans__return);


        }
        {
        System.out.println("Invoking getOrderEvents...");
        se.sveaekonomi.partnerweb.GetOrderEventsRequest _getOrderEvents_request = null;
        se.sveaekonomi.partnerweb.GetOrderEventsResponse2 _getOrderEvents__return = port.getOrderEvents(_getOrderEvents_request);
        System.out.println("getOrderEvents.result=" + _getOrderEvents__return);


        }
        {
        System.out.println("Invoking getAccountCredits...");
        se.sveaekonomi.partnerweb.GetAccountCreditsRequest _getAccountCredits_request = null;
        se.sveaekonomi.partnerweb.GetAccountCreditsResponse2 _getAccountCredits__return = port.getAccountCredits(_getAccountCredits_request);
        System.out.println("getAccountCredits.result=" + _getAccountCredits__return);


        }
        {
        System.out.println("Invoking getClientId...");
        se.sveaekonomi.partnerweb.GetClientIdRequest _getClientId_request = null;
        se.sveaekonomi.partnerweb.GetClientIdResponse2 _getClientId__return = port.getClientId(_getClientId_request);
        System.out.println("getClientId.result=" + _getClientId__return);


        }
        {
        System.out.println("Invoking cancelPaymentPlanRows...");
        se.sveaekonomi.partnerweb.CancelPaymentPlanRowsRequest _cancelPaymentPlanRows_request = null;
        se.sveaekonomi.partnerweb.CancelPaymentPlanRowsResponse2 _cancelPaymentPlanRows__return = port.cancelPaymentPlanRows(_cancelPaymentPlanRows_request);
        System.out.println("cancelPaymentPlanRows.result=" + _cancelPaymentPlanRows__return);


        }
        {
        System.out.println("Invoking approveInvoice...");
        se.sveaekonomi.partnerweb.ApproveInvoiceRequest _approveInvoice_request = null;
        se.sveaekonomi.partnerweb.ApproveInvoiceResponse2 _approveInvoice__return = port.approveInvoice(_approveInvoice_request);
        System.out.println("approveInvoice.result=" + _approveInvoice__return);


        }
        {
        System.out.println("Invoking getInvoicesWithChangedDueDate...");
        se.sveaekonomi.partnerweb.GetInvoicesWithChangedDueDateRequest _getInvoicesWithChangedDueDate_request = null;
        se.sveaekonomi.partnerweb.GetInvoicesWithChangedDueDateResponse2 _getInvoicesWithChangedDueDate__return = port.getInvoicesWithChangedDueDate(_getInvoicesWithChangedDueDate_request);
        System.out.println("getInvoicesWithChangedDueDate.result=" + _getInvoicesWithChangedDueDate__return);


        }
        {
        System.out.println("Invoking getSumOfInvoiceAmount...");
        se.sveaekonomi.partnerweb.SumOfInvoiceAmountRequest _getSumOfInvoiceAmount_request = null;
        se.sveaekonomi.partnerweb.SumOfAmountResponse _getSumOfInvoiceAmount__return = port.getSumOfInvoiceAmount(_getSumOfInvoiceAmount_request);
        System.out.println("getSumOfInvoiceAmount.result=" + _getSumOfInvoiceAmount__return);


        }
        {
        System.out.println("Invoking addOrderRows...");
        se.sveaekonomi.partnerweb.AddOrderRowsRequest _addOrderRows_request = null;
        se.sveaekonomi.partnerweb.AddOrderRowsResponse2 _addOrderRows__return = port.addOrderRows(_addOrderRows_request);
        System.out.println("addOrderRows.result=" + _addOrderRows__return);


        }
        {
        System.out.println("Invoking updateOrder...");
        se.sveaekonomi.partnerweb.UpdateOrderRequest _updateOrder_request = null;
        se.sveaekonomi.partnerweb.UpdateOrderResponse2 _updateOrder__return = port.updateOrder(_updateOrder_request);
        System.out.println("updateOrder.result=" + _updateOrder__return);


        }
        {
        System.out.println("Invoking getRegressionReport...");
        se.sveaekonomi.partnerweb.GetRegressionReportRequest _getRegressionReport_request = null;
        se.sveaekonomi.partnerweb.GetRegressionReportResponse2 _getRegressionReport__return = port.getRegressionReport(_getRegressionReport_request);
        System.out.println("getRegressionReport.result=" + _getRegressionReport__return);


        }
        {
        System.out.println("Invoking deliverOrders...");
        se.sveaekonomi.partnerweb.DeliveryRequest _deliverOrders_request = null;
        se.sveaekonomi.partnerweb.DeliveryResponse _deliverOrders__return = port.deliverOrders(_deliverOrders_request);
        System.out.println("deliverOrders.result=" + _deliverOrders__return);


        }
        {
        System.out.println("Invoking getPendingReasons...");
        se.sveaekonomi.partnerweb.GetPendingReasonsRequest _getPendingReasons_request = null;
        se.sveaekonomi.partnerweb.GetPendingReasonsResponse2 _getPendingReasons__return = port.getPendingReasons(_getPendingReasons_request);
        System.out.println("getPendingReasons.result=" + _getPendingReasons__return);


        }
        {
        System.out.println("Invoking creditInvoiceRows...");
        se.sveaekonomi.partnerweb.CreditInvoiceRequest _creditInvoiceRows_request = null;
        se.sveaekonomi.partnerweb.DeliveryResponse _creditInvoiceRows__return = port.creditInvoiceRows(_creditInvoiceRows_request);
        System.out.println("creditInvoiceRows.result=" + _creditInvoiceRows__return);


        }

        System.exit(0);
    }

}
