// Biomini_Demo.h : main header file for the Biomini_Demo application
//

#if !defined(AFX_Biomini_Demo_H__49601EEA_336E_447A_A883_8A8B06BE4882__INCLUDED_)
#define AFX_Biomini_Demo_H__49601EEA_336E_447A_A883_8A8B06BE4882__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

#ifndef __AFXWIN_H__
	#error include 'stdafx.h' before including this file for PCH
#endif

#include "resource.h"		// main symbols

/////////////////////////////////////////////////////////////////////////////
// CBiomini_DemoApp:
// See Biomini_Demo.cpp for the implementation of this class
//

class CBiomini_DemoApp : public CWinApp
{
public:
	CBiomini_DemoApp();

// Overrides
	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CBiomini_DemoApp)
	public:
	virtual BOOL InitInstance();
	//}}AFX_VIRTUAL

// Implementation

	//{{AFX_MSG(CBiomini_DemoApp)
		// NOTE - the ClassWizard will add and remove member functions here.
		//    DO NOT EDIT what you see in these blocks of generated code !
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};


/////////////////////////////////////////////////////////////////////////////

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_Biomini_Demo_H__49601EEA_336E_447A_A883_8A8B06BE4882__INCLUDED_)
