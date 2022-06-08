// Biomini_DemoDlg.h : header file
//

#if !defined(AFX_Biomini_DemoDLG_H__D511C0D7_B1DD_49F6_A1B9_438492C8BD89__INCLUDED_)
#define AFX_Biomini_DemoDLG_H__D511C0D7_B1DD_49F6_A1B9_438492C8BD89__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000


#include "UFScanner.h"
#include "UFMatcher.h"


#define MAX_TEMPLATE_SIZE		1024
#define MAX_TEMPLATE_NUM		50
#define MAX_USERID_SIZE			10
#define MAX_TEMPLATE_INPUT_NUM	4
#define MAX_TEMPLATE_OUTPUT_NUM	2

#define WM_UPDATE_SCANNER_LIST	WM_APP + 0x10

#define FINGERLIST_COL_SERIAL			0
#define FINGERLIST_COL_USERID			1
#define FINGERLIST_COL_TEMPLATE_1		2
#define FINGERLIST_COL_TEMPLATE_2		3

/////////////////////////////////////////////////////////////////////////////
// CBiomini_DemoDlg dialog

class CBiomini_DemoDlg : public CDialog
{
// Construction
public:
	CBiomini_DemoDlg(CWnd* pParent = NULL);	// standard constructor

	void AddMessage(char* szData, ...);
	void GetScannerTypeString(int nScannerType, char* strScannerType);
	BOOL GetCurrentScannerHandle(HUFScanner* phScanner);
	void GetCurrentScannerSettings();
	void GetMatcherSettings(HUFMatcher hMatcher);
	void UpdateScannerList();
	void AddRow(int nSerial, char* szUserID, BOOL bTemplate1, BOOL bTemplate2);
	void UpdateFingerDataList();

	CString m_message;
	
	HUFMatcher m_hMatcher;

	char m_strError[128];

	unsigned char* m_pUFTemplateBuf;
	int* m_pUFTemplateBufSize;
	unsigned char* m_pISOTemplateBuf;
	int* m_pISOTemplateBufSize;

    unsigned char* m_template1[MAX_TEMPLATE_NUM];
    int m_templateSize1[MAX_TEMPLATE_NUM];
	unsigned char* m_template2[MAX_TEMPLATE_NUM];
    int m_templateSize2[MAX_TEMPLATE_NUM];
	char m_userid[MAX_TEMPLATE_NUM][MAX_USERID_SIZE];

	unsigned char* m_enrolltemplate[MAX_TEMPLATE_NUM];
    int m_enrolltemplateSize[MAX_TEMPLATE_NUM];
	
	int m_template_num;

	int m_quality;

	// Test code: for checking fps
	int m_frame_num;

// Dialog Data
	//{{AFX_DATA(CBiomini_DemoDlg)
	enum { IDD = IDD_Biomini_Demo_DIALOG };
	CListCtrl	m_ctlFingerDataList;
	CStatic	m_ctlImageFrame;
	CEdit	m_ctlMessageEdit;
	CListBox	m_ctlScannerList;
	int		m_nBrightness;
	int		m_nSensitivity;
	BOOL	m_bDetectCore;
	int		m_nSecurityLevel;
	int		m_nTimeout;
	BOOL	m_bFastMode;
	int		m_nType;
	int		m_nEnrollMode;
	int		m_nQuality;
	//}}AFX_DATA

	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CBiomini_DemoDlg)
	protected:
	virtual void DoDataExchange(CDataExchange* pDX);	// DDX/DDV support
	//}}AFX_VIRTUAL

// Implementation
protected:
	HICON m_hIcon;

	// Generated message map functions
	//{{AFX_MSG(CBiomini_DemoDlg)
	virtual BOOL OnInitDialog();
	afx_msg void OnPaint();
	afx_msg HCURSOR OnQueryDragIcon();
	afx_msg void OnDestroy();
	afx_msg void OnSelchangeScannerList();
	afx_msg void OnSelchangeTimeout();
	afx_msg void OnChangeBrightness();
	afx_msg void OnChangeSensitivity();
	afx_msg void OnSelchangeLanguage();
	afx_msg void OnClearMessage();
	afx_msg void OnInit();
	afx_msg void OnUninit();
	afx_msg void OnCaptureSingle();
	afx_msg void OnExtract();
	afx_msg void OnEnroll();
	afx_msg void OnDetectCore();
	afx_msg void OnSelchangeEnrollQuality();
	afx_msg void OnVerify();
	afx_msg void OnSelchangeId();
	afx_msg void OnIdentify();
	afx_msg void OnSelchangeSecurityLevel();
	afx_msg void OnFastMode();
	afx_msg void OnSaveTemplate();
	afx_msg void OnSaveImage();
	afx_msg void OnStartCapturing();
	afx_msg void OnAbortCapturing();
	afx_msg void OnAbortIdentify();
	afx_msg void OnUpdate();
	afx_msg void OnUpdateData(WPARAM wParam, LPARAM lParam);
	afx_msg LRESULT OnUpdateScannerList(WPARAM wParam, LPARAM lParam);
	afx_msg void OnDeleteAllTemplate();
	afx_msg void OnUpdateTemplate();
	afx_msg void OnDeleteTemplate();
	afx_msg void OnSelchangeQuality();
	afx_msg void OnSelchangeType();
	afx_msg void OnAutoCapture();
	afx_msg void OnBnClickedEnDetectFakeAdvanced();
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
public:
	BOOL m_ctl_useEnrollUI;
	CString m_ctl_strLanguage;
	int m_nFakeLevel;
	afx_msg void OnCbnSelchangeCbFakelevel();
	BOOL m_ctl_enableDetectFakeEx;
};

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_Biomini_DemoDLG_H__D511C0D7_B1DD_49F6_A1B9_438492C8BD89__INCLUDED_)
