//program for upper triangle others same just the formula and entering different
#include<iostream>
using namespace std;
int main(){
    int matrix[20][30],m,j,i,k;
    int a[50],counter=0,row,column;
    cout<<"Please enter the dimension of the square matrix"<<endl;
    cin>>m;
    cout<<"please enter the elements of the matrix"<<endl;
    for(i=0;i<m;i++)
    {
        for(j=0;j<m;j++)
        {
            if(i<=j){
                cin>>matrix[i][j];//taking in matrix
            }
            else
                matrix[i][j]=0;

        }
    }
    cout<<"The entered matrix is"<<endl;
    for(i=0;i<m;i++)
    {
        for(j=0;j<m;j++)
        {
            cout<<matrix[i][j]<<" ";
        }

    }
    for(i=0;i<m;i++)//making 1d array for 2d ka
    {
        for(j=0;j<m;j++)
        {
            if(matrix[i][j]!=0)
            {
                a[counter]=matrix[i][j];
                counter++;
            }
        }
    }
    for(k=0;k<counter;k++)
    {
        cout<<a[k]<<" ";
    }
    cout<<"please enter the row and column of the element to be found"<<endl;
    cin>>row>>column;//taking in two elements
    cout<<"the element is"<<a[(row*m)+column-((row*(row+1))/2)];
    return 0;
}
