# qnq-verify

{
	"dataProviderPid": "string",
	"connectorDataProviderPid": "string",
	"endUserPid": "UUID",
	"passthru_TODO": [
		{
			"key": "transactionId",
			"value": "1234569789"
		}
	],
	"endUserDataset": {
		"employee": { //Using FDX "holders" schema
			"name": { //from DDA
				"expnUnparsedName": "string",
				"prefix": "string",
				"first": "string",
				"middle": "string",
				"last": "string",
				"suffix": "string",
				"company": "string" //optional
			},
			"addresses": [ //from DDA
				{
					"expnUnparsedAddress": "string",
					"line1": "string64",
					"line2": "string64",
					"line3": "string64",
					"city": "string64",
					"region": "string64",
					"postalCode": "string",
					"country": "Iso3166CountryCode",
					"type": "BUSINESS|HOME|MAILING"
				}
			],
			"telephones": [ //from FDX
				{
					"type": "HOME|BUSINESS|CELL|FAX",
					"country": "Country calling codes defined by ITU-T recommendations E.123 and E.164",
					"number": "digits15"
				}
			],
			"emails": [ //from FDX
				"string"
			],
			"dateOfBirth": "ISO 8601 full-date in format 'YYYY-MM-DD'", //from FDX
			"expnGovernmentId": [ //from FDX - need a type and may have multiple....  is this passport? DL? 
				{
					"name": "Driver's License",
					"issuer": "State",
					"type": "DL", //future. categorization of government Id.  Possible values: State, License, Visa, Birth Certificate
					"idNumber_TODO": "A378495",
					"piiHandling_TODO": "full | masked | truncated"
				},
				{
					"name": "Social Security",
					"issuer": "Social Security Administration",
					"type": "SSN", //future. categorization of government Id.  Possible values: State, License, Visa, Birth Certificate
					"idNumber_TODO": "111-11-1111",
					"piiHandling_TODO": "full | masked | truncated"
				},
				{
					"name": "Passport",
					"issuer": "Country - US",
					"type": "Passport", //future. categorization of government Id.  Possible values: State, License, Visa, Birth Certificate
					"idNumber_TODO": "1111111111111",
					"piiHandling_TODO": "full | masked | truncated"
				}
			]
		},
		"expn": {
			"incomeSummary": [ //Payroll provider level income summary.
				{
					"amount": 70000.00,
					"incomeType": "NetIncome|GrossIncome|Bonus|Commission",
					"period": { // making stuff up....
						"length": "Year|Month|YTD",
						"start": "2021-01-01",
						"end": "2021-12-31"
					},
					"source": "LastPaystubs|Forecasted|W2s"
				},
				{
					"amount": 72521.37,
					"incomeType": "NetIncome|GrossIncome|Bonus|Commission",
					"period": { // making stuff up....
						"length": "Year|Month|YTD",
						"start": "2022-01-01",
						"end": "2022-12-31"
					},
					"source": "lastPaystubs|forecasted|W2s"
				}
			]
		},
		"employments": [
			{
				"employer": { //cannot use businessResponse as we will not pre-register the employer
					"employerName": "string",
					"addresses": [ //from DDA
						{
							"expnUnparsedAddress": "string",
							"line1": "string64",
							"line2": "string64",
							"line3": "string64",
							"city": "string64",
							"region": "string64",
							"postalCode": "string",
							"country": "Iso3166CountryCode",
							"type": "BUSINESS|HOME|MAILING"
						}
					],
					"telephones": [ //from FDX
						{
							"type": "HOME|BUSINESS|CELL|FAX",
							"country": "Country calling codes defined by ITU-T recommendations E.123 and E.164",
							"number": "digits15"
						}
					],
					"employerIdentificationNumber": "832856109",
					"sic": "5134" //Future
				},
				"originalHireDate": "",
				"startDate": "",
				"endDate": "",
				"workStatus": "Active|Inactive|Retired",
				"employeeId": "999999999",
				"jobTitle": "string",
				"department": "string",
				"payFrequency": "Daily|Weekly|Bi-Weekly|Monthly|Semi-Monthly|Quarterly", //how often is the employee paid, 
				"payInterval": "Hourly|Daily|Weekly|Monthly|Annually", //how is the pay calculated, with annual = salary
				"payRate": 1000.00,
				"expectedHours": "FullTime|PartTime|Seasonal|Daily|Contract", //is this a good field name? employmentType?
				"currencyCode": "USD",
				"expn": {
					"incomeSummary": [
						{
							"amount": 70000.00,
							"incomeType": "NetIncome", // possible values NetIncome, GrossIncome, Bonus, Commission, 
							"period": { // making stuff up....
								"length": "Year",
								"start": "2021-01-01",
								"end": "2021-12-31"
							},
							"sourcing": "lastPaystubs" // possible values forecasted, lastPaystubs, W2s, 
						},
						{
							"amount": 72521.37,
							"incomeType": "NetIncome", // possible values NetIncome, GrossIncome, Bonus, Commission, 
							"period": { // making stuff up....
								"length": "Year",
								"start": "2022-01-01",
								"end": "2022-12-31"
							},
							"sourcing": "forecasted" // possible values forecasted, lastPaystubs, W2s, 
						}
					]
				},
				"payStatements": [
					{
						"payDate": "",
						"currencyCode": "", //declaring the currency at the statement level
						"grossPay": 0,
						"netPay": 0,
						"payRate": 10.00,
						"payInterval": "Hourly", //how is the pay calculated, with annual = salary
						"payIntervalValue": 65,
						"payPeriod": {
							"startDate": "",
							"endDate": "",
							"earnings": {
								"basePay": 0,
								"overtimePay": 0,
								"bonusPay": 0,
								"commissionPay": 0,
								"otherPay": 0
							},
							"deductions": [
								{
									"name": "string",
									"code": "Medical|Vision|Dental|401K|", //future. standardized deduction code across payroll providers and employers
									"category": "Insurance|Garnishment|Withholding|Retirement", //future. categorization of deduction.
									"amount": 0,
									"tax": "PreTax|PostTax|Withholding"
								}
							]
						},
						"yearToDate": {
							"startDate": "",
							"endDate": "",
							"earnings": {
								"basePay": 0,
								"overtimePay": 0,
								"bonusPay": 0,
								"commissionPay": 0,
								"otherPay": 0
							},
							"deductions": [
								{
									"name": "string",
									"code": "Medical|Vision|Dental|401K|", //future.  standardized deduction code across payroll providers and employers
									"category": "Insurance|Garnishment|Withholding|Retirement", //future. categorization of deduction.
									"amount": 0,
									"tax": "PreTax|PostTax|Withholding"
								}
							]
						},
						"payDistributions": [ //using the same words as Experian Verify
							{
								"depositAccount": {
									"routingTransitNumber": "", //FDX field name
									"accountNumber": "", //FDX field name
									"accountNumberDisplay": "", //FDX field name
									"accountType": "CHECKING|SAVINGS" //FDX field name
								},
								"depositTransaction": {
									"amount": 0.0
								}
							}
						],
						"fileAddress": "http://experiancs.com/blah"
					}
				],
				"derivedFields": [
					""
				],
				"taxStatements": [ //future
				]
			}
		]
	}
}
