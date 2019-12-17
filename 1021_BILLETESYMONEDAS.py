a=input()
a=float(a)
a=a*100
a=int(a)
ci=a//10000
a=a%10000
cin=a//5000
a=a%5000
ven=a//2000
a=a%2000
di=a//1000
a=a%1000
fi=a//500
a=a%500
do=a//200
a=a%200
un=a//100
a=a%100
cc=a//50
a=a%50
cv=a//25
a=a%25
cd=a//10
a=a%10
cf=a//5
a=a%5
cu=a//1
print("NOTAS:")
print(str(ci)+" nota(s) de R$ 100.00")
print(str(cin)+" nota(s) de R$ 50.00")
print(str(ven)+" nota(s) de R$ 20.00")
print(str(di)+" nota(s) de R$ 10.00")
print(str(fi)+" nota(s) de R$ 5.00")
print(str(do)+" nota(s) de R$ 2.00")
print("MOEDAS:")
print(str(un)+" moeda(s) de R$ 1.00")
print(str(cc)+" moeda(s) de R$ 0.50")
print(str(cv)+" moeda(s) de R$ 0.25")
print(str(cd)+" moeda(s) de R$ 0.10")
print(str(cf)+" moeda(s) de R$ 0.05")
print(str(cu)+" moeda(s) de R$ 0.01")
