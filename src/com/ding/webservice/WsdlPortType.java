/**
 * WsdlPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.ding.webservice;

public interface WsdlPortType extends java.rmi.Remote {
    public java.lang.String getCinemas(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getHalls(java.lang.String userName, java.lang.String password, java.lang.String cinemaId) throws java.rmi.RemoteException;
    public java.lang.String getSeatPlans(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String hallId) throws java.rmi.RemoteException;
    public java.lang.String getShowDays(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String bookingFlg) throws java.rmi.RemoteException;
    public java.lang.String getShows(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String showDate, java.lang.String bookingFlg) throws java.rmi.RemoteException;
    public java.lang.String getTicketPrices(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String throughFlg, java.lang.String throughSeq, java.lang.String soldBySystem, java.lang.String cardNum, java.lang.String gradeId, java.lang.String usePolicyId, java.lang.String saleDate) throws java.rmi.RemoteException;
    public java.lang.String getSeats(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String sectionId, java.lang.String lockUserId) throws java.rmi.RemoteException;
    public java.lang.String getSeatsIncrement(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String beginTime, java.lang.String endTime) throws java.rmi.RemoteException;
    public java.lang.String getSystemTime(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getBookingFee(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String soldBySystem) throws java.rmi.RemoteException;
    public java.lang.String getSystemSettings(java.lang.String userName, java.lang.String password, java.lang.String cinemaId) throws java.rmi.RemoteException;
    public java.lang.String getReservingCount(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String sectionId) throws java.rmi.RemoteException;
    public java.lang.String getSeriateSeatCount(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String sectionId) throws java.rmi.RemoteException;
    public java.lang.String lockSeats(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String sectionId, java.lang.String lockUserId, java.lang.String numOfSeats, java.lang.String seats, java.lang.String tempBookingId, java.lang.String workstationId, java.lang.String releaseTime) throws java.rmi.RemoteException;
    public java.lang.String lockAutoSeats(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String sectionId, java.lang.String lockUserId, java.lang.String numOfSeats, java.lang.String seats, java.lang.String tempBookingId, java.lang.String workstationId, java.lang.String releaseTime) throws java.rmi.RemoteException;
    public java.lang.String unlockSeats(java.lang.String userName, java.lang.String password, java.lang.String tempBookingId, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String sectionId, java.lang.String lockUserId, java.lang.String seats) throws java.rmi.RemoteException;
    public java.lang.String setBuyingTickets(java.lang.String userName, java.lang.String password, java.lang.String tempBookingId, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String sectionId, java.lang.String lockUserId, java.lang.String seats, java.lang.String ticketTypes, java.lang.String ticketPrices, java.lang.String paymentType, java.lang.String cardNum, java.lang.String usePolicyId, java.lang.String gradeId, java.lang.String cardType, java.lang.String consumePolicyId, java.lang.String firstDate, java.lang.String lastDate, java.lang.String consumeUpgradeTimes, java.lang.String levelForeverFLag, java.lang.String bookingFee, java.lang.String bookingFeeInd, java.lang.String soldBySystem, java.lang.String workstationId, java.lang.String throughFlg, java.lang.String throughSeq, java.lang.String memberId, java.lang.String promoId, java.lang.String markings, java.lang.String consumeId) throws java.rmi.RemoteException;
    public java.lang.String setReleaseTickets(java.lang.String userName, java.lang.String password, java.lang.String tempBookingId, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String sectionId, java.lang.String lockUserId, java.lang.String seats, java.lang.String ticketTypes, java.lang.String ticketPrices, java.lang.String bookingFee, java.lang.String bookingFeeInd, java.lang.String soldBySystem, java.lang.String workstationId, java.lang.String throughFlg, java.lang.String throughSeq, java.lang.String patronId, java.lang.String patronName, java.lang.String teleNo, java.lang.String cardNum, java.lang.String usePolicyId) throws java.rmi.RemoteException;
    public java.lang.String setBookingTickets(java.lang.String userName, java.lang.String password, java.lang.String tempBookingId, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId, java.lang.String sectionId, java.lang.String lockUserId, java.lang.String seats, java.lang.String ticketTypes, java.lang.String ticketPrices, java.lang.String paymentType, java.lang.String cardNum, java.lang.String usePolicyId, java.lang.String gradeId, java.lang.String cardType, java.lang.String consumePolicyId, java.lang.String firstDate, java.lang.String lastDate, java.lang.String consumeUpgradeTimes, java.lang.String levelForeverFLag, java.lang.String bookingFee, java.lang.String bookingFeeInd, java.lang.String soldBySystem, java.lang.String workstationId, java.lang.String throughFlg, java.lang.String throughSeq, java.lang.String patronId, java.lang.String patronName, java.lang.String teleNo) throws java.rmi.RemoteException;
    public java.lang.String getBookingsInfo(java.lang.String userName, java.lang.String password, java.lang.String getType, java.lang.String getCode, java.lang.String cinemaId) throws java.rmi.RemoteException;
    public java.lang.String getRecInfo(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String beginDate, java.lang.String endDate) throws java.rmi.RemoteException;
    public java.lang.String deleteBookingInfo(java.lang.String userName, java.lang.String password, java.lang.String bookingId, java.lang.String cinemaId) throws java.rmi.RemoteException;
    public java.lang.String refundBooking(java.lang.String userName, java.lang.String password, java.lang.String bookingId, java.lang.String cinemaId, java.lang.String soldBySystem) throws java.rmi.RemoteException;
    public java.lang.String getBuyingInfo(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String showDate, java.lang.String filmId, java.lang.String showTime, java.lang.String hallId) throws java.rmi.RemoteException;
    public java.lang.String getTickets(java.lang.String userName, java.lang.String password, java.lang.String bookingId, java.lang.String cinemaId, java.lang.String paymentType, java.lang.String cardNum, java.lang.String usePolicyId, java.lang.String gradeId, java.lang.String cardType, java.lang.String consumePolicyId, java.lang.String firstDate, java.lang.String lastDate, java.lang.String consumeUpgradeTimes, java.lang.String levelForeverFLag, java.lang.String soldBySystem, java.lang.String workstationId) throws java.rmi.RemoteException;
    public java.lang.String checkBooking(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String checkType, java.lang.String bookingId, java.lang.String cardNum, java.lang.String usePolicyId, java.lang.String gradeId, java.lang.String cardType, java.lang.String consumePolicyId, java.lang.String firstDate, java.lang.String lastDate, java.lang.String consumeUpgradeTimes, java.lang.String levelForeverFLag, java.lang.String soldBySystem) throws java.rmi.RemoteException;
    public java.lang.String setPrintTickets(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String bookingId, java.lang.String seats, java.lang.String workstationId, java.lang.String thoughFlg) throws java.rmi.RemoteException;
    public java.lang.String getCardPolicyInfo(java.lang.String userName, java.lang.String password, java.lang.String cinemaId, java.lang.String gradeId, java.lang.String usePolicyId) throws java.rmi.RemoteException;
    public java.lang.String qryBasicInfo(java.lang.String cardFacadeCd, java.lang.String checkingCode, java.lang.String corpId, java.lang.String corpPass, java.lang.String tpye, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String qryCardGrade(java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String qryAddOrder(java.lang.String cardFacadeCd, java.lang.String cardPass, java.lang.String startDate, java.lang.String endDate, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String qryBookingOrder(java.lang.String cardFacadeCd, java.lang.String cardPass, java.lang.String startDate, java.lang.String endDate, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String modifyMemberInfo(java.lang.String cardFacadeCd, java.lang.String cardUserId, java.lang.String token, java.lang.String idCard, java.lang.String address, java.lang.String mobilePhone, java.lang.String birthdate, java.lang.String mailAddress, java.lang.String phone, java.lang.String sex, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String modifyPassword(java.lang.String token, java.lang.String cardFacadeCd, java.lang.String oldPass, java.lang.String newPass, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String modifyCardState(java.lang.String cardFacadeCd, java.lang.String state, java.lang.String token, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String addCardMoney(java.lang.String cardFacadeCd, java.lang.String money, java.lang.String corpId, java.lang.String corpPass, java.lang.String token, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String qryFacadeCd(java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode, java.lang.String serialCd) throws java.rmi.RemoteException;
    public java.lang.String qrySellInfo(java.lang.String usePolicyId, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String qryState(java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String qryLocFilmFlg(java.lang.String cardFacadeCd, java.lang.String locationCd, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String addCardBuyFilm(java.lang.String token, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode, java.lang.String cardFacadeCd, java.lang.String cardPass, java.lang.String bookingId, java.lang.String gradeId, java.lang.String locationCd, java.lang.String totalAmt, java.lang.String totalMarking, java.lang.String firstDate, java.lang.String lastDate, java.lang.String soldBySystem, java.lang.String numOfTkts, java.lang.String numOfDisTkts, java.lang.String filmCd, java.lang.String cinemaCd, java.lang.String consumeFlag, java.lang.String fingerFlag, java.lang.String countTimes, java.lang.String consumeUpgradeTimes, java.lang.String pointDiscount, java.lang.String showDt, java.lang.String showTime) throws java.rmi.RemoteException;
    public java.lang.String cardRefund(java.lang.String token, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode, java.lang.String cardFacadeCd, java.lang.String cardPass, java.lang.String bookingId) throws java.rmi.RemoteException;
    public java.lang.String qryDiscountCard(java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode, java.lang.String cardFacadeCd, java.lang.String bookingId, java.lang.String locationCd, java.lang.String filmCd, java.lang.String cinemaCd, java.lang.String showDt, java.lang.String showTime) throws java.rmi.RemoteException;
    public java.lang.String qryCheckLocation(java.lang.String cardFacadeCd, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode) throws java.rmi.RemoteException;
    public java.lang.String discountCardBuyFilm(java.lang.String corpId, java.lang.String corpPass, java.lang.String token, java.lang.String verifyCode, java.lang.String cardFacadeCd, java.lang.String cardPass, java.lang.String bookingId, java.lang.String locationCd, java.lang.String filmCd, java.lang.String cinemaCd, java.lang.String showDt, java.lang.String showTime, java.lang.String soldBySystem, java.lang.String tolAmtPayable, java.lang.String tolSeatsBooked, java.lang.String tolDisAmtPayable, java.lang.String tolDisSeatsBooked) throws java.rmi.RemoteException;
    public java.lang.String discountCardRefund(java.lang.String corpId, java.lang.String corpPass, java.lang.String token, java.lang.String verifyCode, java.lang.String cardFacadeCd, java.lang.String cardPass, java.lang.String bookingId, java.lang.String refAmtPayable, java.lang.String tolSeatsRefund, java.lang.String refDisAmtPayable, java.lang.String tolDisSeatsRefund) throws java.rmi.RemoteException;
    public java.lang.String qryTicket(java.lang.String cardFacadeCd, java.lang.String corpId, java.lang.String corpPass, java.lang.String verifyCode, java.lang.String filmCd, java.lang.String cinemaCd, java.lang.String locationCd, java.lang.String showDt, java.lang.String showTime) throws java.rmi.RemoteException;
    public java.lang.String posSelectClass(java.lang.String user, java.lang.String password, java.lang.String workstation) throws java.rmi.RemoteException;
    public java.lang.String posSelectGoods(java.lang.String user, java.lang.String password, java.lang.String workstation, java.lang.String goodsClass) throws java.rmi.RemoteException;
    public java.lang.String posSelectGoods2(java.lang.String user, java.lang.String password, java.lang.String workstation, java.lang.String goodsID, java.lang.String gradeID) throws java.rmi.RemoteException;
    public java.lang.String posSelectSale(java.lang.String user, java.lang.String password, java.lang.String workstation, java.lang.String saleId) throws java.rmi.RemoteException;
    public java.lang.String posSelectHold(java.lang.String user, java.lang.String password, java.lang.String workstation, java.lang.String saleId) throws java.rmi.RemoteException;
    public java.lang.String posSelectReturn(java.lang.String user, java.lang.String password, java.lang.String workstation, java.lang.String saleId) throws java.rmi.RemoteException;
    public java.lang.String selectReport(java.lang.String user, java.lang.String password, java.lang.String dates) throws java.rmi.RemoteException;
    public java.lang.String posSale(java.lang.String user, java.lang.String password, java.lang.String workstation, java.lang.String gradeID, java.lang.String saleXml) throws java.rmi.RemoteException;
    public java.lang.String posHold(java.lang.String user, java.lang.String password, java.lang.String workstation, java.lang.String gradeID, java.lang.String exchangeCode, java.lang.String promotionID, java.lang.String memberID, java.lang.String saleXml) throws java.rmi.RemoteException;
    public java.lang.String posReturn(java.lang.String user, java.lang.String password, java.lang.String workstation, java.lang.String discount, java.lang.String payTotal, java.lang.String saleXml) throws java.rmi.RemoteException;
    public java.lang.String posReturnHold(java.lang.String user, java.lang.String password, java.lang.String workstation, java.lang.String holdID) throws java.rmi.RemoteException;
}